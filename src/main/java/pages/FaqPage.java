package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.switchTo;

public class FaqPage {

    public static final String FAQ_PAGE_URL = "https://jobsure.ru/faq";

                                             // локаторы
    //  логотип сайта верхний
    @FindBy(how = How.XPATH, using = "//*[@class='logo']")
    private SelenideElement logoUpperImage;

    // логотип сайта нижний
    @FindBy(how = How.XPATH, using = "//*[@class='img-fluid mb20 footer__logo']")
    private SelenideElement logoLowerImage;

    // кнопка Фейсбук верхняя
    @FindBy(how = How.XPATH, using = "//*[@id='topbar']/div/div[1]/span/a[1]/i")
    private SelenideElement facebookUpperButton;

    // кнопка Фейсбук нижняя
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-facebook fa-lg']")
    private SelenideElement facebookLowerButton;

    // кнопка Инстаграмм верхняя
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-instagram']")
    private SelenideElement instagramUpperButton;

    // кнопка Инстаграмм нижняя
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-instagram fa-lg']")
    private SelenideElement instagramLowerButton;

    // кнопка Live Internet
    @FindBy(how = How.XPATH, using = "//*[@id='licnt3187']")
    private SelenideElement lifeInternetButton;

    // кнопка Политика конфидециальности
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Политика конфиденциальности')]")
    private SelenideElement privacyPolicyButton;

    // кнопка Цены верхняя
    @FindBy(how = How.XPATH, using = "//span/a[@href='/prices']")
    private SelenideElement pricesUpperButton;

    // кнопка Часто задаваемые вопросы
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Часто задаваемые вопросы')]")
    private SelenideElement faqButton;

    // кнопка Главная
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Главная')]")
    private SelenideElement mainButton;

    // кнопка Резюме
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Резюме')]")
    private SelenideElement resumeButton;

    // кнопка Команда
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Команда')]")
    private SelenideElement teamButton;

    // кнопка Цены нижняя
    @FindBy(how = How.XPATH, using = "//li/a[@href='/prices']")
    private SelenideElement pricesLowerButton;

    // кнопка Контакты
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Контакты')]")
    private SelenideElement contactsButton;

    // кнопка скролла вверх
    @FindBy(how = How.XPATH, using = "//*[@id='back-to-top']")
    private SelenideElement scrollUpButton;

    // кнопка подверждения Рассылки по почте
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-long-arrow-right']")
    private SelenideElement confirmSendMailingButton;

    // всплывающее окно Напишите нам сообщение
    @FindBy(how = How.XPATH, using = "//*[@class='hoverl_c3b3']")
    private SelenideElement sendMessageWindow;

    // кнопка закрытия всплывающего окна
    @FindBy(how = How.XPATH, using = "//*[@class='closeIcon_fba0']")
    private SelenideElement closeSendMessageWindow;

    // кнопка отправки текста сообщения во всплывающем окне
    @FindBy(how = How.XPATH, using = "//*[@class='sendButton_fe98']")
    private SelenideElement sendMessageInWindowButton;

    // поле ввода Email в нижней части меню
    @FindBy(how = How.XPATH, using = "//*[@id='email']")
    private SelenideElement footerEmailField;

    // поле ввода текста в всплывающее окно
    @FindBy(how = How.XPATH, using = "//*[@class='inputField_a573']")
    private SelenideElement sendMessageWindowField;

    // картинка в разделе Часто задаваемые вопросы (слушатели)
    @FindBy(how = How.XPATH, using = "//*[@id='section-subheader']")
    private SelenideElement faqImage;

    // раздел Техническое интервью
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Техническое интервью')]")
    private SelenideElement techInterviewSection;

    // кнопка Квалификация наставника
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Какая квалификация наставника?')]")
    private SelenideElement mentorQualificationsButton;

    // текст Квалификация наставника
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Все наши наставники')]")
    private SelenideElement mentorQualificationsText;

    // кнопка Сколько по времени длится техническое собеседование?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Сколько по времени длится техническое собеседование?')]")
    private SelenideElement howLongDoesTechnicalInterviewLastButton;

    // текст кнопки Сколько по времени длится техническое собеседование?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Консультация с наставником')]")
    private SelenideElement howLongDoesTechnicalInterviewLastText;

    // кнопка По каким темам меня будут собеседовать?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'По каким темам меня будут собеседовать?')]")
    private SelenideElement topicsWillBeInterviewedButton;

    // текст кнопки По каким темам меня будут собеседовать?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Консультация будет происходить')]")
    private SelenideElement topicsWillBeInterviewedText;

    // кнопка Есть ли помощь в трудоустройсте в компании после собеседования?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Есть ли помощь в трудоустройсте в компании после собеседования?')]")
    private SelenideElement helpInFindingEmploymentButton;

    // текст кнопки Есть ли помощь в трудоустройстве в компании после собеседования?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Да, мы начинаем сотрудничество')]")
    private SelenideElement helpInFindingEmploymentText;

    // кнопка Вы можете дать рекомендации для резюме?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Вы можете дать рекомендации для резюме?')]")
    private SelenideElement recommendationsResumeButton;

    // текст кнопки Вы можете дать рекомендации для резюме?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Да, конечно')]")
    private SelenideElement recommendationsResumeText;

    // кнопка На какую зарплату я могу рассчитывать после консультации?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'На какую зарплату я могу рассчитывать после консультации?')]")
    private SelenideElement salaryExpectAfterConsultationButton;

    // текст кнопки На какую зарплату я могу рассчитывать после консультации?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Наши кандидаты после консультаций')]")
    private SelenideElement salaryExpectAfterConsultationText;

    // раздел Резюме
    @FindBy(how = How.XPATH, using = "//*[@id='section-features']/div/div/div[2]/div[1]")
    private SelenideElement resumeSection;

    // кнопка Как вы составляете резюме?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Как вы составляете резюме?')]")
    private SelenideElement howComposeResumeButton;

    // текст кнопки Как вы составляете резюме?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Резюме составляется')]")
    private SelenideElement howComposeResumeText;

    // кнопка Можно ли составить резюме на английском языке?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Можно ли составить резюме на английском языке?')]")
    private SelenideElement writeResumeInEnglishButton;

    // текст кнопки Можно ли составить резюме на английском языке?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Да, по запросу')]")
    private SelenideElement writeResumeInEnglishText;

    // кнопка Я совсем новичок, писать нечего. Резюме будет пустым, стоит ли пытаться?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Я совсем новичок')]")
    private SelenideElement completeBeginnerButton;

    // текст кнопки Я совсем новичок, писать нечего. Резюме будет пустым, стоит ли пытаться?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Мы как раз делаем акцент')]")
    private SelenideElement completeBeginnerText;

    // кнопка В какое время можно записаться на консультацию по составлению резюме?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'В какое время можно записаться')]")
    private SelenideElement whatTimeCanSignUpForResumeConsultationButton;

    // текст кнопки В какое время можно записаться на консультацию по составлению резюме?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'В дневное')]")
    private SelenideElement whatTimeCanSignUpForResumeConsultationText;

    // кнопка Как я могу записаться на консультацию?
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Как я могу записаться на консультацию?')]")
    private SelenideElement appointmentForConsultationButton;

    // текст кнопки Как я могу записаться на консультацию?
    @FindBy(how = How.XPATH, using = "//*[@id='accordion-b-5']/p/text()[1]")
    private SelenideElement appointmentForConsultationText;

    // кнопка Записаться тексте кнопки Как я могу записаться на консультацию?
    @FindBy(how = How.XPATH, using = "//*[@id='accordion-b-5']/p/a")
    private SelenideElement signUpInAppointmentForConsultationTextButton;

    // кнопка Записаться на консультацию
    @FindBy(how = How.XPATH, using = "//*[@class='btn-custom wow fadeInUp scroll-to sign-in-button animated animated']")
    private SelenideElement appointmentButton;

                                                    // методы
    @Step("Click header logo image")
    public MainPage clickLogoUpperImage() {
        logoUpperImage.click();
        return page(MainPage.class);
    }

    @Step("Scroll and click footer logo image")
    public MainPage clickLogoLowerImage() {
        logoLowerImage.scrollTo();
        logoLowerImage.click();
        return page(MainPage.class);
    }

    @Step("Click main button")
    public MainPage clickMainButton() {
        mainButton.click();
        return page(MainPage.class);
    }

    @Step("Click header facebook logo and switch to new window")
    public void clickFacebookUpperButton() {
        facebookUpperButton.click();
        switchTo().window(1);
    }

    @Step("Scroll, click footer facebook logo and switch to new window")
    public void clickFacebookLowerButton() {
        facebookLowerButton.scrollTo();
        facebookLowerButton.click();
        switchTo().window(1);
    }

    @Step("Click header instagram logo and switch to new window")
    public void clickInstagramUpperButton() {
        instagramUpperButton.click();
        switchTo().window(1);
    }

    @Step("Scroll, click footer instagram logo and switch to new window")
    public void clickInstagramLowerButton() {
        instagramLowerButton.scrollTo();
        instagramLowerButton.click();
        switchTo().window(1);
    }

    @Step("Click life internet button and switch to new window")
    public void clickLifeInternetButton() {
        lifeInternetButton.click();
        switchTo().window(1);
    }

    @Step("Click privacy policy button")
    public PrivacyPolicy clickPrivacyPolicyButton() {
        privacyPolicyButton.click();
        return page(PrivacyPolicy.class);
    }

    @Step("Click upper prices button")
    public FaqPage clickPricesUpperButton() {
        pricesUpperButton.click();
        return this;
    }

    @Step("Click faq button")
    public FaqPage clickFaqButton() {
        faqButton.click();
        return this;
    }

    @Step("Click resume button")
    public ResumePage clickResumeButton() {
        resumeButton.click();
        return page(ResumePage.class);
    }

    @Step("Click team button")
    public TeamPage clickTeamButton() {
        teamButton.click();
        return page(TeamPage.class);
    }

    @Step("Click lower prices button")
    public PricesPage clickPricesLowerButton() {
        pricesLowerButton.click();
        return page(PricesPage.class);
    }

    @Step("Click contacts button")
    public ContactsPage clickContactsButton() {
        contactsButton.click();
        return page(ContactsPage.class);
    }

    @Step("Scroll and set value in footer email field")
    public FaqPage setFooterEmailField(String email) {
        footerEmailField.scrollTo();
        footerEmailField.setValue(email);
        return this;
    }

    @Step("Click confirm send mailing button")
    public FaqPage clickConfirmSendMailingButton() {
        confirmSendMailingButton.click();
        return this;
    }

    @Step("Scroll to footer and click scroll up button")
    public FaqPage clickScrollUpButton() {
        footerEmailField.scrollTo();
        scrollUpButton.click();
        return this;
    }

    @Step("Set value in send message window field")
    public FaqPage setSendMessageWindowField(String message) {
        sendMessageWindowField.setValue(message);
        return this;
    }

    @Step("Click send message window")
    public FaqPage clickSendMessageWindow() {
        sendMessageWindow.click();
        return this;
    }

    @Step("Click close send message window")
    public FaqPage clickCloseSendMessageWindow() {
        closeSendMessageWindow.click();
        return this;
    }

    @Step("Check and click sign up in appointment for consultation text button")
    public ReservationPage clickSignUpInAppointmentForConsultationTextButton() {
        appointmentForConsultationButton.scrollTo();
        appointmentForConsultationButton.click();
        signUpInAppointmentForConsultationTextButton.click();
        return page(ReservationPage.class);
    }

    @Step("Faq image is displayed")
    public boolean isDisplayedFaqImage() {
        return faqImage.isDisplayed();
    }

    @Step("Scroll and click appointment button")
    public ReservationPage clickAppointmentButton() {
        appointmentButton.scrollTo();
        appointmentButton.click();
        return page(ReservationPage.class);
    }

    @Step("Scroll to tech interview section")
    public FaqPage scrollToTechInterviewSection() {
        techInterviewSection.scrollTo();
        return this;
    }

    @Step("Scroll to resume section")
    public FaqPage scrollToResumeSection() {
        resumeSection.scrollTo();
        return this;
    }

    @Step("Click mentor qualifications button")
    public FaqPage clickMentorQualificationsButton() {
        mentorQualificationsButton.click();
        return this;
    }

    @Step("Mentor qualifications text is displayed")
    public boolean isDisplayedMentorQualificationsText() {
        return mentorQualificationsText.isDisplayed();
    }

    @Step("Click how long does technical interview last button")
    public FaqPage clickHowLongDoesTechnicalInterviewLastButton() {
        howLongDoesTechnicalInterviewLastButton.click();
        return this;
    }

    @Step("How long does technical interview last text is displayed")
    public boolean isDisplayedHowLongDoesTechnicalInterviewLastText() {
        return howLongDoesTechnicalInterviewLastText.isDisplayed();
    }

    @Step("Click appointment for consultation button")
    public FaqPage clickAppointmentForConsultationButton() {
        appointmentForConsultationButton.click();
        return this;
    }

    @Step("Appointment for consultation text is displayed")
    public boolean isDisplayedAppointmentForConsultationText() {
        return appointmentForConsultationText.isDisplayed();
    }

    @Step("Click what time can sign up for resume consultation button")
    public FaqPage clickWhatTimeCanSignUpForResumeConsultationButton() {
        whatTimeCanSignUpForResumeConsultationButton.click();
        return this;
    }

    @Step("What time can sign up for resume consultation text is displayed")
    public boolean isDisplayedWhatTimeCanSignUpForResumeConsultationText() {
        return whatTimeCanSignUpForResumeConsultationText.isDisplayed();
    }

    @Step("Click complete beginner button")
    public FaqPage clickCompleteBeginnerButton() {
        completeBeginnerButton.click();
        return this;
    }

    @Step("Complete beginner text is displayed")
    public boolean isDisplayedCompleteBeginnerText() {
        return completeBeginnerText.isDisplayed();
    }

    @Step("Click write resume in english button")
    public FaqPage clickWriteResumeInEnglishButton() {
        writeResumeInEnglishButton.click();
        return this;
    }

    @Step("Write resume in english text is displayed")
    public boolean isDisplayedWriteResumeInEnglishText() {
        return writeResumeInEnglishText.isDisplayed();
    }

    @Step("Click how compose resume button")
    public FaqPage clickHowComposeResumeButton() {
        howComposeResumeButton.click();
        return this;
    }

    @Step("How compose resume text is displayed")
    public boolean isDisplayedHowComposeResumeText() {
        return howComposeResumeText.isDisplayed();
    }

    @Step("Click salary expect after consultation button")
    public FaqPage clickSalaryExpectAfterConsultationButton() {
        salaryExpectAfterConsultationButton.click();
        return this;
    }

    @Step("Salary expect after consultation text is displayed")
    public boolean isDisplayedSalaryExpectAfterConsultationText() {
        return salaryExpectAfterConsultationText.isDisplayed();
    }

    @Step("Click recommendations resume button")
    public FaqPage clickRecommendationsResumeButton() {
        recommendationsResumeButton.click();
        return this;
    }

    @Step("Recommendations resume text is displayed")
    public boolean isDisplayedRecommendationsResumeText() {
        return recommendationsResumeText.isDisplayed();
    }

    @Step("Click help in finding employment button")
    public FaqPage clickHelpInFindingEmploymentButton() {
        helpInFindingEmploymentButton.click();
        return this;
    }

    @Step("Help in finding employment text is displayed")
    public boolean isDisplayedHelpInFindingEmploymentText() {
        return helpInFindingEmploymentText.isDisplayed();
    }

    @Step("Click topics will be interviewed button")
    public FaqPage clickTopicsWillBeInterviewedButton() {
        topicsWillBeInterviewedButton.click();
        return this;
    }

    @Step("Topics will be interviewed text is displayed")
    public boolean isDisplayedTopicsWillBeInterviewedText() {
        return topicsWillBeInterviewedText.isDisplayed();
    }


}
