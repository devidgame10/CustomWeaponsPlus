# CustomWeaponsPlus (assembled)

Ez a csomag a CustomWeaponsPlus plugin forrását tartalmazza (Paper 1.21.8, Java 17).
**Megjegyzés:** a jelen környezetben nem tudok Java/ Maven build-et futtatni — ezért a ZIP a forrásprojektet tartalmazza.
A plugin jar létrehozásához a gépeden futtasd:

```bash
mvn clean package -DskipTests
```

A build után a `target/CustomWeaponsPlus-1.0.0.jar` fájlt másold a Paper szerver `plugins/` mappájába és indítsd újra a szervert.

## Tartalom
- `pom.xml` — Maven beállítások (Paper API, Vault provided, SnakeYAML)
- `src/main/java/...` — minden Java forrás (Main, WeaponDefinition, storage, service, listener, command)
- `src/main/resources/plugin.yml` — plugin meta
- `src/main/resources/config.yml` — alap konfiguráció
- `src/main/resources/data/weapons.yml` — példa fegyverek
- `resourcepack/` — egyszerű resourcepack template (zip-eld és hostold, vagy teszteld lokálisan)

## Gyors telepítés
1. Ellenőrizd, hogy telepítve van Java 17 és Maven.
2. `mvn clean package -DskipTests`
3. Másold a `target/CustomWeaponsPlus-1.0.0.jar` fájlt a szerver `plugins/` mappájába.
4. Indítsd el a Paper 1.21.8 szervert.
5. Ellenőrizd konzolon a plugin logját és futtasd `/cw` parancsot.

## Ha szeretnéd, elkészítem a kész jar-t is:
- Tudom segíteni a jar elkészítésében ha megadod, hogy engedélyezed-e, hogy építsek egy jar-t a cloudban (jelen környezetben a build nem futtatható). Ha inkább azt szeretnéd, segítek lépésről-lépésre a build folyamatban.
