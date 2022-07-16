package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.switchTo;

public class PricesPage {

    public static final String PRICES_PAGE_URL = "https://jobsure.ru/prices";

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

    // кнопка выбора Помошь с резюме
    @FindBy(how = How.XPATH, using = "//*[@id='content']/section[2]/div/div/div/ul/li[1]/div/a[2]")
    private SelenideElement helpWithResumeButton;

    // кнопка выбора Техническое интервью
    @FindBy(how = How.XPATH, using = "//*[@id='content']/section[2]/div/div/div/ul/li[2]/div/a[2]")
    private SelenideElement techInterviewButton;

    // кнопка выбора Помошь с резюме + Техническое интервью
    @FindBy(how = How.XPATH, using = "//*[@id='content']/section[2]/div/div/div/ul/li[3]/div/a[2]")
    private SelenideElement comboButton;

    // поле ввода Email в нижней части меню
    @FindBy(how = How.XPATH, using = "//*[@id='email']")
    private SelenideElement footerEmailField;

    // поле ввода текста в всплывающее окно
    @FindBy(how = How.XPATH, using = "//*[@class='inputField_a573']")
    private SelenideElement sendMessageWindowField;

    // картинка в разделе Цены (чашка кофе и блокнот)
    @FindBy(how = How.XPATH, using = "//*[@id='section-home']")
    private SelenideElement pricesImage;

    // картинка Помощь с резюме (блокнот)
    @FindBy(how = How.XPATH, using = "//*[@id='content']/section[2]/div/div/div/ul/li[1]/div/div[1]/a/img[2]")
    private SelenideElement helpWithResumeImage;

    // картинка Техническое интервью (мужчина с ноутбуком)
    @FindBy(how = How.XPATH, using = "//*[@id='content']/section[2]/div/div/div/ul/li[2]/div/div[1]/a/img[2]")
    private SelenideElement techInterviewImage;

    // картинка Помощь с резюме + Техническое интервью (группа людей)
    @FindBy(how = How.XPATH, using = "//*[@id='content']/section[2]/div/div/div/ul/li[3]/div/div[1]/a/img[2]")
    private SelenideElement comboHelpImage;


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
    public PricesPage clickPricesUpperButton() {
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
        return this;
    }

    @Step("Click contacts button")
    public ContactsPage clickContactsButton() {
        contactsButton.click();
        return page(ContactsPage.class);
    }

    @Step("Scroll and set value in footer email field")
    public PricesPage setFooterEmailField(String email) {
        footerEmailField.scrollTo();
        footerEmailField.setValue(email);
        return this;
    }

    @Step("Click confirm send mailing button")
    public PricesPage clickConfirmSendMailingButton() {
        confirmSendMailingButton.click();
        return this;
    }

    @Step("Scroll to footer and click scroll up button")
    public PricesPage clickScrollUpButton() {
        footerEmailField.scrollTo();
        scrollUpButton.click();
        return this;
    }

    @Step("Set value in send message window field")
    public PricesPage setSendMessageWindowField(String message) {
        sendMessageWindowField.setValue(message);
        return this;
    }

    @Step("Click send message window")
    public PricesPage clickSendMessageWindow() {
        sendMessageWindow.click();
        return this;
    }

    @Step("Click close send message window")
    public PricesPage clickCloseSendMessageWindow() {
        closeSendMessageWindow.click();
        return this;
    }

    @Step("Header image (cofe and bloknot) is displayed")
    public boolean isDisplayedPricesImage() {
        return pricesImage.isDisplayed();
    }

    @Step("Help with resume image is displayed")
    public boolean isDisplayedHelpWithResumeImage() {
        return helpWithResumeImage.isDisplayed();
    }

    @Step("Tech interview image is displayed")
    public boolean isDisplayedTechInterviewImage() {
        return techInterviewImage.isDisplayed();
    }

    @Step("Help with resume + tech interview image is displayed")
    public boolean isDisplayedComboHelpImage() {
        return comboHelpImage.isDisplayed();
    }

    @Step("Click help with resume button")
    public ReservationPage clickHelpWithResumeButton() {
        helpWithResumeButton.click();
        return page(ReservationPage.class);
    }

    @Step("Click tech interview button")
    public ReservationPage clickTechInterviewButton() {
        techInterviewButton.click();
        return page(ReservationPage.class);
    }

    @Step("Click help with resume + tech interview button")
    public ReservationPage clickComboButton() {
        comboButton.click();
        return page(ReservationPage.class);
    }

}
