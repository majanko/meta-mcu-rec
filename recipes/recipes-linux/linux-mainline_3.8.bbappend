# The main PR is now using MACHINE_KERNEL_PR, for omap3 see conf/machine/include/omap3.inc

do_configure_append() {
    echo "CONFIG_USB_USBNET=m" >> ${S}/.config
    echo "CONFIG_USB_NET_CDC_NCM=m" >> ${S}/.config

    echo "CONFIG_IP_NF_TARGET_REDIRECT=m" >> ${S}/.config 

    echo "CONFIG_NETFILTER_XT_TARGET_REDIRECT=m" >> ${S}/.config
}

PACKAGES =+ "${PN}-ad7153"
