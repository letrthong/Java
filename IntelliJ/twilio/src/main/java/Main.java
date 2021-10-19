
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;

import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Main {
    public static final String accountSid ="AC944d62f5924b8ac8209d63051e37544d";
    public static final String authToken = "fe43d921803da431f71ee7a613cb7a4f";

    public static void main(String[] args) {
       /* Twilio.init(accountSid, authToken);
        String whats_app_form = "+14155238886";

        //USERID
        String whats_app_to = "+84356148008";

        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:" + whats_app_to ),
                        new com.twilio.type.PhoneNumber("whatsapp:" + whats_app_form ),
                        "Hello there!")
                .create();


        System.out.println("Status=" +  message.getStatus());
        System.out.println("sid=" + message.getSid());
        System.out.println("Price=" + message.getPrice());
        System.out.println("PriceUnit=" + message.getPriceUnit());*/

        // Initialize Api Context
        ApiContextInitializer.init();

        // Instantiate Telegram Bots API
        TelegramBotsApi botsApi = new TelegramBotsApi();

        // Register our bot
        try {
            botsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}