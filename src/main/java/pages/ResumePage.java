package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.switchTo;

public class ResumePage {

    public static final String RESUME_PAGE_URL = "https://jobsure.ru/resume";

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
    private SelenideElement priceImage;

    // кнопка Записаться на консультацию
    @FindBy(how = How.XPATH, using = "//*[@class='btn-custom wow fadeInUp scroll-to sign-in-button animated animated']")
    private SelenideElement appointmentButton;

    // кнопка Напишите
    @FindBy(how = How.XPATH, using = "//*[@id='de_nav_carousel']/div[1]/div/div[1]/li/span")
    private SelenideElement writeButton;

    // текст кнопки Напишите
    @FindBy(how = How.XPATH, using = "//*[@id='tab1']")
    private SelenideElement writeText;

    // кнопка Расскажите
    @FindBy(how = How.XPATH, using = "//*[@id='de_nav_carousel']/div[1]/div/div[2]/li/span")
    private SelenideElement tellButton;

    // текст кнопки Расскажите
    @FindBy(how = How.XPATH, using = "//*[@id='tab2']")
    private SelenideElement tellText;

    // кнопка Составляем
    @FindBy(how = How.XPATH, using = "//*[@id='de_nav_carousel']/div[1]/div/div[3]/li/span")
    private SelenideElement makingUpButton;

    // текст кнопки Составляем
    @FindBy(how = How.XPATH, using = "//*[@id='tab3']")
    private SelenideElement makingUpText;

    // кнопка Поиск
    @FindBy(how = How.XPATH, using = "//*[@id='de_nav_carousel']/div[1]/div/div[4]/li/span")
    private SelenideElement searchButton;

    // текст кнопки Поиск
    @FindBy(how = How.XPATH, using = "//*[@id='tab4']")
    private SelenideElement searchText;

    // кнопка Успех
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Успех')]")
    private SelenideElement successButton;

    // текст кнопки Успех
    @FindBy(how = How.XPATH, using = "//*[@id='tab5']")
    private SelenideElement successText;

    // раздел Напишите нам
    @FindBy(how = How.XPATH, using = "//*[@class='text-center']")
    private SelenideElement writeToUsSection;

    // поле Ваше имя
    @FindBy(how = How.XPATH, using = "//*[@id='name']")
    private SelenideElement nameField;

    // поле email
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Email']")
    private SelenideElement emailField;

    // поле Ваш номер телефона
    @FindBy(how = How.XPATH, using = "//*[@id='phone']")
    private SelenideElement phoneField;

    // поле Расскажите о своём опыте
    @FindBy(how = How.XPATH, using = "//*[@id='message']")
    private SelenideElement messageField;

    // кнопка Отправить
    @FindBy(how = How.XPATH, using = "//*[@id='send_message']")
    private SelenideElement sendMessageButton;




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
    public ResumePage clickPricesUpperButton() {
        pricesUpperButton.click();
        return this;
    }

    @Step("Click faq button")
    public FaqPage clickFaqButton() {
        faqButton.click();
        return page(FaqPage.class);
    }

    @Step("Click resume button")
    public ResumePage clickResumeButton() {
        resumeButton.click();
        return this;
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
    public ResumePage setFooterEmailField(String email) {
        footerEmailField.scrollTo();
        footerEmailField.setValue(email);
        return this;
    }

    @Step("Click confirm send mailing button")
    public ResumePage clickConfirmSendMailingButton() {
        confirmSendMailingButton.click();
        return this;
    }

    @Step("Scroll to footer and click scroll up button")
    public ResumePage clickScrollUpButton() {
        footerEmailField.scrollTo();
        scrollUpButton.click();
        return this;
    }

    @Step("Set value in send message window field")
    public ResumePage setSendMessageWindowField(String message) {
        sendMessageWindowField.setValue(message);
        return this;
    }

    @Step("Click send message window")
    public ResumePage clickSendMessageWindow() {
        sendMessageWindow.click();
        return this;
    }

    @Step("Click close send message window")
    public ResumePage clickCloseSendMessageWindow() {
        closeSendMessageWindow.click();
        return this;
    }

    @Step("Price image is displayed")
    public boolean isDisplayedFaqImage() {
        return priceImage.isDisplayed();
    }

    @Step("Scroll and click appointment button")
    public ReservationPage clickAppointmentButton() {
        appointmentButton.scrollTo();
        appointmentButton.click();
        return page(ReservationPage.class);
    }


    @Step("Click write button")
    public ResumePage clickWriteButton() {
        writeButton.click();
        return this;
    }

    @Step("Write text is displayed")
    public boolean isDisplayedWriteText() {
        return writeText.isDisplayed();
    }

    @Step("Click tell button")
    public ResumePage clickTellButton() {
        tellButton.click();
        return this;
    }

    @Step("Tell text is displayed")
    public boolean isDisplayedTellText() {
        return tellText.isDisplayed();
    }
    @Step("Click making up button")
    public ResumePage clickMakingUpButton() {
        makingUpButton.click();
        return this;
    }

    @Step("Making up text is displayed")
    public boolean isDisplayedMakingUpText() {
        return makingUpText.isDisplayed();
    }
    @Step("Click search button")
    public ResumePage clickSearchButton() {
        searchButton.click();
        return this;
    }

    @Step("Search text is displayed")
    public boolean isDisplayedSearchText() {
        return searchText.isDisplayed();
    }
    @Step("Click success button")
    public ResumePage clickSuccessButton() {
        successButton.click();
        return this;
    }

    @Step("Success text is displayed")
    public boolean isDisplayedSuccessText() {
        return successText.isDisplayed();
    }

    @Step("Scroll to write to us Section")
    public ResumePage scrollToWriteToUsSection(){
        writeToUsSection.scrollTo();
        return this;
    }

    @Step("Set value in name field")
    public ResumePage setNameField(String name) {
        nameField.setValue(name);
        return this;
    }

    @Step("Set value in email field")
    public ResumePage setEmailField(String email) {
        emailField.setValue(email);
        return this;
    }

    @Step("Set value in phone field")
    public ResumePage setPhoneField(String phone) {
        phoneField.setValue(phone);
        return this;
    }

    @Step("Set value in message field")
    public ResumePage setMessageField(String message) {
        messageField.setValue(message);
        return this;
    }

    @Step("Click send message button")
    public ResumePage clickSendMessageButton() {
        sendMessageButton.click();
        return this;
    }

}
