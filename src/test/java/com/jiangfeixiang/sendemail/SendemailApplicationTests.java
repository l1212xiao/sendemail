package com.jiangfeixiang.sendemail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendemailApplicationTests {

    /**
     * 注入发送邮件的接口
     */
    @Autowired
    private IMailService mailService;

    /**
     * 测试发送文本邮件
     */
    @Test
    public void sendmail() {
        mailService.sendSimpleMail("qj876@cummins.com", "主题：你好普通邮件", "内容：第一封邮件");
    }

    @Test
    public void sendmailHtml() {
        String content = "hello";
        mailService.sendHtmlMail("822719853@qq.com",
                "主题：你好html邮件",
                "<h1>内容：第一封html邮件</h1>" + content);
    }
}

