DESCRIPTION = "Android minimal bootable environment"
HOMEPAGE = "https://android.googlesource.com"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM ??= "file://${WORKSPACE}/meta-mcu-rec//files/LICENCE;md5=cf4a21270f331e068c4ae90d6711e62e"
SRC_URI = ""

S = "${WORKDIR}/git"

inherit autotools


