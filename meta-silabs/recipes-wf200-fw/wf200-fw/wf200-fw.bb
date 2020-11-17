DESCRIPTION = "Silabs WF200 firmware"
LICENSE = "CLOSED"


SRC_URI = "git://github.com/SiliconLabs/wfx-firmware;protocol=git"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

do_install() {
         install -d ${D}/lib/firmware/
         install -m 0755 ${WORKDIR}/git/wfm_wf200_C0.sec ${D}/lib/firmware/
}
  
FILES_${PN} = "/lib/firmware/"
