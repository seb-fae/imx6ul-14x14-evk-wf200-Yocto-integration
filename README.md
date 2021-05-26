# imx6ul-14x14-evk-wf200-Yocto-integration

A device tree file integrating wf200 on IMX EVK platform is provided as "**imx6ul-14x14-evk-wf200.dts**".
This file should be added to directory:
**imx-yocto-bsp/build-x11/tmp/work-shared/imx6ulevk/kernel-source/arch/arm/boot/dts/**

The "**Makefile**" located in same directory should be modified to take into account this new DTS file.

All the receipe for intergration are provided in this repository.
