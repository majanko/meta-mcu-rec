require adb-core.inc

PRIORITY = "10"

SRCREV = "3e453498083d3caa38f25d0ba6cc7c9829010bbc" 
SRC_URI += "git://android.googlesource.com/platform/system/core;branch=${PV};protocol=https"

SRC_URI[md5sum] = "9906594f691eabfc7d85592fbec91cc1"
SRC_URI[sha256sum] = "36f08dacbc3113420c70f79feccaae2f31e869c1470c32371b5b590587f9609e"
#git://github.com/bmwcarit/joynr.git;branch=${PV};protocol=git

do_configure_prepend() {
    cp -f ${WORKDIR}/core/Makefile ${S}/system/core/adb/
}

CENCEBBCLASSEXTEND += " native "
