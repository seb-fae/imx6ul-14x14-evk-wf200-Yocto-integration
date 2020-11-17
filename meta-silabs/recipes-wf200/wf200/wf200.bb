DESCRIPTION = "Silabs WF200 driver module"
LICENSE = "CLOSED"

inherit module

SRC_URI = "git://github.com/SiliconLabs/wfx-linux-driver.git;protocol=git"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "KDIR=${STAGING_KERNEL_DIR}"
DEPENDS += "imx-test"

  

