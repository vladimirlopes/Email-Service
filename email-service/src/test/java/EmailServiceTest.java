import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.mail.javamail.JavaMailSender;

import com.vlsystem.api.email.Email;
import com.vlsystem.api.email.EmailService;
import com.vlsystem.api.email.TestMailSenderConfig;

import lombok.Data;
@Data
@SpringBootTest
@Import(TestMailSenderConfig.class)
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Autowired
    private JavaMailSender mailSender;

    @Test
    public void testSendEmail() {
        // Arrange: Configurar o ambiente de teste
        String to = "destinatario@example.com";
        String subject = "Assunto";
        String body = "Corpo do e-mail";

        Email email = new Email(to, subject, body);

        // Act: Chamar o método que deseja testar
        boolean result = emailService.sendMail(email);

        // Assert: Verificar se o resultado é o esperado
        assertTrue(result);
    }
}