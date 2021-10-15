import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class Main {
    public static final String accountSid ="AC944d62f5924b8ac8209d63051e37544d";
    public static final String authToken = "fe43d921803da431f71ee7a613cbxxxx";

    public static void main(String[] args) {
        Twilio.init(accountSid, authToken);
        String whats_app_form = "+14155238886";

        //USERID
        String whats_app_to = "+8435614xxxx";

        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:" + whats_app_to ),
                        new com.twilio.type.PhoneNumber("whatsapp:" + whats_app_form ),
                        "Hello there!")
                .create();


        System.out.println("Status=" +  message.getStatus());
        System.out.println("sid=" + message.getSid());
        System.out.println("Price=" + message.getPrice());
        System.out.println("PriceUnit=" + message.getPriceUnit());
    }
}