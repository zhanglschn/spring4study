package com.juzix.knight.service.impl;

import com.juzix.knight.service.Quest;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

    private PrintStream ps;

    public SlayDragonQuest(PrintStream stream) {
        this.ps = stream;
    }

    public void embark() {
        ps.println("Embarking on quest to slay the dragon!!");
    }
}
