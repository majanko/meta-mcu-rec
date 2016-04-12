DESCRIPTION = "Open Source Cross Build Framework   \
for the Qualcomm MDM9640 ARMv7processor application processor."
LICENSE = "MIT"

inherit core-image

require images.inc
require dev_packages.inc

IMAGE_INSTALL += "kernel-module-g-multi"
IMAGE_INSTALL += "kernel-module-g-ffs"

IMAGE_INSTALL += "gadget-init"
IMAGE_INSTALL += "usb-cdc-ncm-gadget-init5-start"
IMAGE_INSTALL += "gadget-init-network"
IMAGE_INSTALL += "htop"
IMAGE_INSTALL += "procps"
IMAGE_INSTALL += "iptables"
IMAGE_INSTALL += "vlan"
