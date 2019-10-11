# meta-example
This repository can be used as an initial reference point when creating a new image on yocto for Toradex modules.

# Notes

- Since there isn't an option to append a configuration file on yocto, this layer should be added before **meta-toradex-nxp** in the **bblayers.conf** file in order to use the new machine configuration file.

- The **defconfig** can be created running *make savedefconfig* after doing changes on the kernel repository using the *make menuconfig*.

- On this example the **example-lxde-image.bb** recipe was created using the **angstrom-lxde-image.bb** recipe as reference.

- On this example the **imx6dl-colibri-example.dts** file was create using the **imx6dl-colibri-eval-v3.dts** file as reference.

