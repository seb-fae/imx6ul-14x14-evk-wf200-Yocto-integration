DESCRIPTION = "Silabs WF200 pds"
LICENSE = "CLOSED"


SRC_URI = "file://wf200.pds"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}"

do_install() {
         install -d ${D}/lib/firmware/
         install -m 0755 ${WORKDIR}/wf200.pds ${D}/lib/firmware/
}
  
FILES_${PN} = "/lib/firmware/"
