# segfail_mod

Peregovorka Minecraft mod

![alt text](src/main/resources/assets/segfail/icon.png "Title")

## Additions to the game

### Copper armor

| Icon                                                                         | Name              | Protection |
| ---------------------------------------------------------------------------- | ----------------- | ------- |
| ![h](src/main/resources/assets/segfail/textures/item/copper_helmet.png)      | Copper Helmet     | 2 |
| ![h](src/main/resources/assets/segfail/textures/item/copper_chestplate.png)  | Copper Chestplate | 5 |
| ![h](src/main/resources/assets/segfail/textures/item/copper_leggins.png)     | Copper Leggins    | 4 |
| ![h](src/main/resources/assets/segfail/textures/item/copper_boots.png)       | Copper Boots      | 2 |

### Copper items

All have durability of 200 and are slightly worse in mining speed/damage than their iron counterparts.
Copper Pickaxe mines same blocks as Iron Pickaxe.

| Icon                                                                     | Name           |
| -------------------------------------------------------------------------| ---------------|
| ![h](src/main/resources/assets/segfail/textures/item/copper_sword.png)   | Copper Sword   |
| ![h](src/main/resources/assets/segfail/textures/item/copper_axe.png)     | Copper Axe     |
| ![h](src/main/resources/assets/segfail/textures/item/copper_shovel.png)  | Copper Shovel  |
| ![h](src/main/resources/assets/segfail/textures/item/copper_pickaxe.png) | Copper Pickaxe |
| ![h](src/main/resources/assets/segfail/textures/item/copper_hoe.png)     | Copper Hoe     |

## Dev setup

### Generate JB Intellij Idea project with decompiled MC sources

```bash
./gradlew.bat genSources idea
```

### Build .jar locally

```bash
./gradlew.bat build
```