package org.example;


import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;



public class Main {
    public static void main(String[] args) {
        TelegramBotsApi telegramBotsApi;
        try {
            telegramBotsApi =  new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new Bot());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}