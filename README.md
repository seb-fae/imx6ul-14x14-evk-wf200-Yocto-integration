# Yocto Integration

A device tree file integrating wf200 (SPI) on IMX EVK platform is provided as "**imx6ul-14x14-evk-wf200.dts**".

This file should be added to directory:
**"imx-yocto-bsp/build-x11/tmp/work-shared/imx6ulevk/kernel-source/arch/arm/boot/dts/"**

The "**Makefile**" located in same directory should be modified to take into account this new DTS file.

All the receipe for intergration are provided in this repository.

# Testing

Once your kernel is compiled these are useful commands for testing:

## Add/remove wf200 driver:
 
Load driver:
```
modprobe wfx
 ```

Remove driver
```
modprobe -r wfx
```

## Connect to an Access Point :
 
```
wpa_supplicant -B -i wlan0 -c /etc/wpa_supplicant.conf
wpa_cli
remove_network 0
add_network
set_network 0 ssid "ap-name"
set_network 0 psk "password"
enable_network 0
udhcpc -i wlan0
```

## Test you connection
```
ping 8.8.8.8
```
