package com.juzix.knight.service.impl;

import com.juzix.knight.knights.Minstrel;
import com.juzix.knight.service.Knight;
import com.juzix.knight.service.Quest;

public class BraveKnight implements Knight {
    private Quest quest;
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}