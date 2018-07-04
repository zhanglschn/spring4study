package com.juzix.knight.test;

import com.juzix.knight.service.Quest;
import com.juzix.knight.service.impl.BraveKnight;
import org.junit.Test;

import static org.mockito.Mockito.*;
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}