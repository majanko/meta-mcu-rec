require adb-core.inc

PRIORITY = "10"

SRCREV = "eddf4548698e9b13e79971bc78a32d5f6e02a5ba" 
SRC_URI += "git://android.googlesource.com/platform/system/extras;branch=${PV};protocol=https"

SRC_URI[md5sum] = "9906594f691eabfc7d85592fbec91cc1"
SRC_URI[sha256sum] = "36f08dacbc3113420c70f79feccaae2f31e869c1470c32371b5b590587f9609e"
#git://github.com/bmwcarit/joynr.git;branch=${PV};protocol=git

CENCEBBCLASSEXTEND += " native "
