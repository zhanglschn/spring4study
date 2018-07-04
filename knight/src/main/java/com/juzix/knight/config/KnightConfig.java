package com.juzix.knight.config;

import com.juzix.knight.service.Knight;
import com.juzix.knight.service.Quest;
import com.juzix.knight.service.impl.BraveKnight;
import com.juzix.knight.service.impl.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
