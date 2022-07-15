package pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public static final String MAIN_PAGE_URL = "https://jobsure.ru/";
    private final ElementsCollection reviews = $$x("//*[contains (text(), 'Буквально через 3 дня прилетел хороший оффер')]");

    // добавить элементы на последние статьи ???

                                                      // локаторы
    // логотип сайта верхний
    @FindBy(how = How.XPATH, using = "//*[@class='logo-2']")
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

    // кнопка Политика конфидециальности
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Политика конфиденциальности')]")
    private SelenideElement privacyPolicyButton;

    // кнопка Часто задаваемые вопросы
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Часто задаваемые вопросы')]")
    private SelenideElement faqButton;

    // кнопка Помощь с резюме
    @FindBy(how = How.XPATH, using = "//a[@id='pills-home-tab']")
    private SelenideElement helpWithResumeButton;

    // кнопка Техническое интервью
    @FindBy(how = How.XPATH, using = "//a[@id='pills-profile-tab']")
    private SelenideElement techInterviewButton;

    // кнопка Комплексная консультация
    @FindBy(how = How.XPATH, using = "//a[@id='pills-contact-tab']")
    private SelenideElement comprehensiveConsultationButton;

    // кнопка Записаться на консультацию верхняя
    @FindBy(how = How.XPATH, using = "//*[@class='btn-custom wow fadeInUp scroll-to animated animated']")
    private SelenideElement consultationUpperButton;

    // кнопка Записаться на консультацию средняя
    @FindBy(how = How.XPATH, using = "//a[@style='visibility: visible; animation-delay: 1s; animation-name: fadeInUp;']")
    private SelenideElement consultationMiddleButton;

    // кнопка Записаться на консультацию нижняя
    @FindBy(how = How.XPATH, using = "//a[@style='visibility: visible; animation-delay: 1s;'][@class='btn-custom wow fadeInUp scroll-to sign-in-button animated animated']")
    private SelenideElement consultationLowerButton;

    // кнопка подверждения Рассылки по почте
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-long-arrow-right']")
    private SelenideElement confirmSendMailingButton;

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

    // кнопка Цены верхняя
    @FindBy(how = How.XPATH, using = "//span/a[@href='/prices']")
    private SelenideElement pricesUpperButton;

    // кнопка Вы пишите нам
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Вы пишете нам')]")
    private SelenideElement sendUsButton;

    // кнопка Мы проводим анализ
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Мы проводим анализ')]")
    private SelenideElement weWillDoAnaliseButton;

    // кнопка Составляем резюме
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Составляем резюме')]")
    private SelenideElement weWillDoResumeButton;

    // кнопка Проводим техническое интервью
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Проводим техническое интервью')]")
    private SelenideElement weWillDoInterviewButton;

    // кнопка Начинаем строить карьеру
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Начинаем строить карьеру')]")
    private SelenideElement startedCareerButton;

    // кнопка скролла вверх
    @FindBy(how = How.XPATH, using = "//*[@id='back-to-top']")
    private SelenideElement scrollUpButton;

    // кнопка переключателя отзывов активная
    @FindBy(how = How.XPATH, using = "//*[@class='owl-dot active']")
    private SelenideElement activeSwitchButton;

    // кнопка переключателя отзывов неактивная
    @FindBy(how = How.XPATH, using = "//*[@class='owl-dot']")
    private SelenideElement notActiveSwitchButton;

    // всплывающее окно Напишите нам сообщение
    @FindBy(how = How.XPATH, using = "//*[@class='hoverl_c3b3']")
    private SelenideElement sendMessageWindow;

    // кнопка закрытия всплывающего окна
    @FindBy(how = How.XPATH, using = "//*[@class='closeIcon_fba0']")
    private SelenideElement closeSendMessageWindow;

    // кнопка отправки текста сообщения во всплывающем окне
    @FindBy(how = How.XPATH, using = "//*[@class='sendButton_fe98']")
    private SelenideElement sendMessageInWindowButton;

    // картинка в разделе Наши услуги
    @FindBy(how = How.XPATH, using = "//*[@class='image-container col-md-6 pull-right']")
    private SelenideElement ourServicesImage;

    // картинка в главном меню (девушка)
    @FindBy(how = How.XPATH, using = "//*[@data-bgimage='url(images/background/bg-1.jpg) top']")
    private SelenideElement mainMenuImage;

    // картинка в нижней части меню (парень)
    @FindBy(how = How.XPATH, using = "//*[@data-bgimage='url(images/background/bg-2.jpg) top']")
    private SelenideElement footerMenuImage;

    // поле ввода Email в нижней части меню
    @FindBy(how = How.XPATH, using = "//*[@id='email']")
    private SelenideElement footerEmailField;

    // поле ввода текста в всплывающее окно
    @FindBy(how = How.XPATH, using = "//*[@class='inputField_a573']")
    private SelenideElement sendMessageWindowField;

    // текст главного меню
    @FindBy(how = How.XPATH, using = "//*[@class='wow fadeInUp animated animated']")
    private SelenideElement mainMenuText;

    // раздел О нас
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'О нас')]")
    private SelenideElement aboutUsSection;

    // текст раздела О нас
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Мы команда специалистов')]")
    private SelenideElement aboutUsText;

    // раздел Наши услуги
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Чем мы можем помочь')]")
    private SelenideElement ourServicesSection;

    // текст после нажатия кнопки Помощь с резюме
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Разберем опыт')]")
    private SelenideElement helpWithResumeText;

    // текст после нажатия кнопки Техническое интервью
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Проведем')]")
    private SelenideElement techInterviewText;

    // текст после нажатия кнопки Комплексная консультация
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Комплексная консультация-подготовка')]")
    private SelenideElement comprehensiveConsultationText;

    // раздел Как это работает
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Как это работает?')]")
    private SelenideElement howThisWorkingSection;

    // текст после нажатия кнопки Вы пишите нам
    @FindBy(how = How.XPATH, using = "//*[@id='tab1']")
    private SelenideElement sendUsText;

    // текст после нажатия кнопки Мы проводим анализ
    @FindBy(how = How.XPATH, using = "//*[@id='tab2']")
    private SelenideElement weWillDoAnaliseText;

    // текст после нажатия кнопки Составляем резюме
    @FindBy(how = How.XPATH, using = "//*[@id='tab3']")
    private SelenideElement weWillDoResumeText;

    // текст после нажатия кнопки Проводим техническое интервью
    @FindBy(how = How.XPATH, using = "//*[@id='tab4']")
    private SelenideElement weWillDoInterviewText;

    // текст после нажатия кнопки Начинаем строить карьеру
    @FindBy(how = How.XPATH, using = "//*[@id='tab5']")
    private SelenideElement startedCareerText;

    // текст раздела Наши методы
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Наши методы')]")
    private SelenideElement ourMethodsText;

    // текст в разделе Наши методы - образование
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Образование')]")
    private SelenideElement educationText;

    // текст в разделе Наши методы - опыт экспертов
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Опыт экспертов')]")
    private SelenideElement expertsExperienceText;

    // текст в разделе Наши методы - самопознание
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Самопознание')]")
    private SelenideElement selfKnowledgeText;

    // текст в разделе Наши методы - онлайн-формат
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Онлайн-формат')]")
    private SelenideElement onlineFormatText;

    // текст в разделе Наши методы - ошибки
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Ошибки')]")
    private SelenideElement errorsText;

    // текст в разделе Наши методы - вдохновение
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Вдохновение')]")
    private SelenideElement inspirationText;

    // раздел Отзывы
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Отзывы')]")
    private SelenideElement reviewsSection;

    // раздел Последние статьи
    @FindBy(how = How.XPATH, using = "//*[@class='padding40 no-margin']")
    private SelenideElement lastArticlesSection;

                                   // методы
    @Step("Click header logo image")
    public void clickLogoUpperImage() {
        logoUpperImage.click();
    }

    @Step("Scroll and click footer logo image")
    public void clickLogoLowerImage() {
        logoLowerImage.scrollTo();
        logoLowerImage.click();
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

    @Step("Click privacy policy button")
    public PrivacyPolicy clickPrivacyPolicyButton() {
        privacyPolicyButton.click();
        return page(PrivacyPolicy.class);
    }

    @Step("Click faq button")
    public FaqPage clickFaqButton() {
        faqButton.click();
        return page(FaqPage.class);
    }

    @Step("Click help with resume button")
    public MainPage clickHelpWithResumeButton() {
        helpWithResumeButton.click();
        return this;
    }

    @Step("Click tech interview button")
    public MainPage clickTechInterviewButton() {
        techInterviewButton.click();
        return this;
    }

    @Step("Click comprehensive consultation button")
    public MainPage clickComprehensiveConsultationButton() {
        comprehensiveConsultationButton.click();
        return this;
    }

    @Step("Click header consultation button")
    public ReservationPage clickConsultationUpperButton() {
        consultationUpperButton.click();
        return page(ReservationPage.class);
    }

    @Step("Click middle consultation button")
    public ReservationPage clickConsultationMiddleButton() {
        consultationMiddleButton.click();
        return page(ReservationPage.class);
    }

    @Step("Click footer consultation button")
    public ReservationPage clickConsultationLowerButton() {
        consultationLowerButton.click();
        return page(ReservationPage.class);
    }

    @Step("Click confirm send mailing button")
    public MainPage clickConfirmSendMailingButton() {
        confirmSendMailingButton.click();
        return this;
    }

    @Step("Click main button")
    public void clickMainButton() {
        mainButton.click();
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

    @Step("Click upper prices button")
    public PricesPage clickPricesUpperButton() {
        pricesUpperButton.click();
        return page(PricesPage.class);
    }

    @Step("Click you send us button")
    public MainPage clickSendUsButton() {
        sendUsButton.click();
        return this;
    }

    @Step("Click we will do analise button")
    public MainPage clickWeWillDoAnaliseButton() {
        weWillDoAnaliseButton.click();
        return this;
    }

    @Step("Click we will do resume button")
    public MainPage clickWeWillDoResumeButton() {
        weWillDoResumeButton.click();
        return this;
    }

    @Step("Click we will do interview button")
    public MainPage clickWeWillDoInterviewButton() {
        weWillDoInterviewButton.click();
        return this;
    }

    @Step("Click started career button")
    public MainPage clickStartedCareerButton() {
        startedCareerButton.click();
        return this;
    }

    @Step("Click send message window")
    public MainPage clickSendMessageWindow() {
        sendMessageWindow.click();
        return this;
    }

    @Step("Click close send message window")
    public MainPage clickCloseSendMessageWindow() {
        closeSendMessageWindow.click();
        return this;
    }

    @Step("Scroll to footer and click scroll up button")
    public MainPage clickScrollUpButton() {
        footerEmailField.scrollTo();
        scrollUpButton.click();
        return this;
    }

    @Step("Click active switch button in the reviews section")
    public MainPage clickActiveSwitchButton() {
        activeSwitchButton.click();
        return this;
    }

    @Step("Click not active switch button in the reviews section")
    public MainPage clickNotActiveSwitchButton() {
        notActiveSwitchButton.click();
        return this;
    }

    @Step("Click confirm sending message in window")
    public MainPage clickSendMessageInWindowButton() {
        sendMessageInWindowButton.click();
        return this;
    }

    @Step("Main menu image (women) is displayed")
    public boolean isDisplayedMainMenuImage() {
        return mainMenuImage.isDisplayed();
    }

    @Step("Image in the our services section is displayed")
    public boolean isDisplayedOurServicesImage() {
        return ourServicesImage.isDisplayed();
    }

    @Step("Footer image (men) is displayed")
    public boolean isDisplayedFooterMenuImage() {
        return footerMenuImage.isDisplayed();
    }

    @Step("Scroll and set value in footer email field")
    public MainPage setFooterEmailField(String email) {
        footerEmailField.scrollTo();
        footerEmailField.setValue(email);
        return this;
    }

    @Step("Set value in send message window field")
    public MainPage setSendMessageWindowField(String message) {
        sendMessageWindowField.setValue(message);
        return this;
    }

    @Step("Scroll to our methods section")
    public MainPage scrollToOurMethodsText() {
        ourMethodsText.scrollTo();
        return this;
    }

    @Step("Education text in our methods section is displayed")
    public boolean isDisplayedEducationText() {
        return educationText.isDisplayed();
    }

    @Step("Experts experience text in our methods section is displayed")
    public boolean isDisplayedExpertsExperienceText() {
        return expertsExperienceText.isDisplayed();
    }

    @Step("Self knowledge text in our methods section is displayed")
    public boolean isDisplayedSelfKnowledgeText() {
        return selfKnowledgeText.isDisplayed();
    }

    @Step("Online format text in our methods section is displayed")
    public boolean isDisplayedOnlineFormatText() {
        return onlineFormatText.isDisplayed();
    }

    @Step("Errors text in our methods section is displayed")
    public boolean isDisplayedErrorsText() {
        return errorsText.isDisplayed();
    }

    @Step("Inspiration text in our methods section is displayed")
    public boolean isDisplayedInspirationText() {
        return inspirationText.isDisplayed();
    }

    @Step("Scroll to our services section")
    public MainPage scrollToOurServicesSection() {
        ourServicesSection.scrollTo();
        return this;
    }

    @Step("Help with resume text is displayed")
    public boolean isDisplayedHelpWithResumeText() {
        return helpWithResumeText.isDisplayed();
    }

    @Step("Tech interview text is displayed")
    public boolean isDisplayedTechInterviewText() {
        return techInterviewText.isDisplayed();
    }

    @Step("Comprehensive consultation text is displayed")
    public boolean isDisplayedComprehensiveConsultationText() {
        return comprehensiveConsultationText.isDisplayed();
    }

    @Step("Scroll to how this working section")
    public MainPage scrollToHowThisWorkingSection() {
        howThisWorkingSection.scrollTo();
        return this;
    }

    @Step("Send us text is displayed")
    public boolean isDisplayedSendUsText() {
        return sendUsText.isDisplayed();
    }

    @Step("We will do analise text is displayed")
    public boolean isDisplayedWeWillDoAnaliseText() {
        return weWillDoAnaliseText.isDisplayed();
    }

    @Step("We will do resume text is displayed")
    public boolean isDisplayedWeWillDoResumeText() {
        return weWillDoResumeText.isDisplayed();
    }

    @Step("We will do interview text is displayed")
    public boolean isDisplayedWeWillDoInterviewText() {
        return weWillDoInterviewText.isDisplayed();
    }

    @Step("Started career text is displayed")
    public boolean isDisplayedStartedCareerText() {
        return startedCareerText.isDisplayed();
    }

    @Step("Scroll to about us section")
    public MainPage scrollToAboutUsSection() {
        aboutUsSection.scrollTo();
        return this;
    }

    @Step("About us text is displayed")
    public boolean isDisplayedAboutUsText() {
        return aboutUsText.isDisplayed();
    }

    @Step("Main menu text is displayed")
    public boolean isDisplayedMainMenuText() {
        return mainMenuText.isDisplayed();
    }

    @Step("Scroll to reviews section")
    public MainPage scrollToReviewsSection() {
        reviewsSection.scrollTo();
        return this;
    }

    @Step("Get first element from reviews collection")
    private SelenideElement oneElementFromReviews() {
        return reviews.first();
    }

    @Step("One review is displayed")
    public boolean isDisplayedOneElementFromReviews() {
        return oneElementFromReviews().isDisplayed();
    }

    @Step("Scroll to last articles section")
    public MainPage scrollToLastArticlesSection() {
        lastArticlesSection.scrollTo();
        return this;
    }
}
