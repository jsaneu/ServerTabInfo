package com.black_dog20.servertabinfo.common.datagen;

import com.black_dog20.bml.datagen.BaseLanguageProvider;
import com.black_dog20.servertabinfo.ServerTabInfo;
import net.minecraft.data.DataGenerator;

import static com.black_dog20.servertabinfo.common.utils.DimensionTranslations.*;
import static com.black_dog20.servertabinfo.common.utils.Translations.*;

public class GeneratorLanguageRussian extends BaseLanguageProvider {

    public GeneratorLanguageRussian(DataGenerator gen) {
        super(gen, ServerTabInfo.MOD_ID, "ru_ru");
    }

    @Override
    protected void addTranslations() {
        // Keys
        //addPrefixed(CATEGORY, "Server Tab Info");
        //addPrefixed(SHOW_KEY, "Show TPS list");

        // Gui
        addPrefixed(NOT_INSTALLED, "Server Tab Info не установлен на сервере");
        //addPrefixed(PAGE, "Page %d of %d");
        addPrefixed(MEAN,"в среднем");
        addPrefixed(MS, "мс");
        //addPrefixed(TPS, "tps");
        //addPrefixed(UNKOWN, "Unknown");

        // Dims
        addPrefixed(OVERALL, "Итого");
        addPrefixed(OVERWORLD, "Верхний мир");
        addPrefixed(THE_NETHER, "Нижний мир");
        addPrefixed(THE_END, "Край");

        addPrefixed(THE_LOST_CITIES, "Заброшенные города");
        addPrefixed(THE_TWILIGHT_FOREST, "Сумеречный лес");
    }
}
