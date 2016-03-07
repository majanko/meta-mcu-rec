DESCRIPTION = "USB gadget system V init startup script"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"
PR = "r0"

COMPATIBLE_MACHINE = "(beaglebone)"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "kernel-module-g-multi \
	kernel-module-usbnet \
	kernel-module-cdc-ether \
	kernel-module-cdc-ncm \
	kernel-module-cdc-subset \
	gadget-init \
	gadget-init-network \
	kernel-module-x-tables \
        kernel-module-ip-tables \
	kernel-module-iptable-filter \
	kernel-module-iptable-nat \
	kernel-module-nf-defrag-ipv4 \
	kernel-module-nf-conntrack-ipv4 \
	kernel-module-nf-nat \
	kernel-module-xt-redirect \
	kernel-module-xt-tcpudp \
"
SRC_URI = "file://mount-usb-gadget \
"

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "mount-usb-gadget"
INITSCRIPT_PARAMS_${PN} = "start 20 2 3 4 5 . stop 80 0 1 6 ."

inherit update-rc.d

do_install() {
  install -d ${D}${bindir}
}

do_install_append() {
  install -m 0755 ${WORKDIR}/mount-usb-gadget -D ${D}${sysconfdir}/init.d/mount-usb-gadget
}
