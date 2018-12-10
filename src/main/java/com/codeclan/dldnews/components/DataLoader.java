package com.codeclan.dldnews.components;

import com.codeclan.dldnews.models.Article;
import com.codeclan.dldnews.models.Author;
import com.codeclan.dldnews.models.Category;
import com.codeclan.dldnews.repository.articles.ArticleRepository;
import com.codeclan.dldnews.repository.authors.AuthorRepository;
import com.codeclan.dldnews.repository.categories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    CategoryRepository categoryRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        DateFormat sfd = new SimpleDateFormat("dd-MM-yy");
        String newDate = "24-07-2018";
        Date date = null;
        try {
            date = sfd.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Author author1 = new Author("Elaina Plott");
        authorRepository.save(author1);

        Author author2 = new Author("Uri Friedman");
        authorRepository.save(author2);

        Author author3 = new Author("David Sims");
        authorRepository.save(author3);

        Author author4 = new Author("Elaine Godfrey");
        authorRepository.save(author4);

        Author author5 = new Author("Amanda Mull");
        authorRepository.save(author5);

        Author author6 = new Author("Alan Taylor");
        authorRepository.save(author6);

        Author author7 = new Author("Spencer Kornhaber");
        authorRepository.save(author7);

        Author author8 = new Author("Krishnadev Calamur");
        authorRepository.save(author8);

        Author author9 = new Author("Joe Pinsker");
        authorRepository.save(author9);

        Author author10 = new Author("Annie Lowrey");
        authorRepository.save(author10);

        Category category1 = new Category("Politics");
        categoryRepository.save(category1);

        Category category2 = new Category("Science");
        categoryRepository.save(category2);

        Category category3 = new Category("Technology");
        categoryRepository.save(category3);

        Category category4 = new Category("Business");
        categoryRepository.save(category4);

        Category category5 = new Category("Human Interest");
        categoryRepository.save(category5);

        Article politics1 = new Article(author1, "What PM hopes to achieve by pulling Brexit vote", date, category1, "By pulling the vote, the PM will be hoping she can convince Brussels there will be no deal without more movement on the backstop.", "This is the main text of the article", "media url");
        articleRepository.save(politics1);

        Article politics2 = new Article(author1, "Government warns of six-month border disruption under 'no-deal' Brexit", date, category1, "Ministers revise their assessment to warn cross-Channel ports such as Dover could suffer trade chaos for half a year.", "This is the main text of the article", "media url");
        articleRepository.save(politics2);

        Article politics3 = new Article(author1, "Trump chief of staff: Speculation mounts over job", date, category1, "Speculation is mounting over who will be US President Donald Trump's new chief of staff after the man believed to be the top candidate said he too was leaving the government.", "This is the main text of the article", "media url");
        articleRepository.save(politics3);

        Article politics4 = new Article(author2, "Yellow vest protests: Macron to hold crisis meeting", date, category1, "French President Emmanuel Macron is meeting trade unions and employers' organisations, in a bid to defuse weeks of unrest in Paris and other cities.", "This is the main text of the article", "media url");
        articleRepository.save(politics4);

        Article politics5 = new Article(author2, "Politics Article 5", date, category1, "Russia 'paved way for Ukraine ship seizures with fake news drive'.", "EU’s security commissioner says Moscow spread false claims for at least a year before last month’s seizures.", "media url");
        articleRepository.save(politics5);

        Article science1 = new Article(author3, "Mystery of dark matter may have been solved by Oxford scientists", date, category2, "Roughly 95% of the universe is believed to be missing - but a new study suggests a fluid which could explain the mystery.", "This is the main text of the article", "media url");
        articleRepository.save(science1);

        Article science2 = new Article(author3, "How billion-to-one DNA match led to Russell Bishop's murder conviction", date, category2, "In 1986 and on his rearrest in 2016, Bishop changed his story several times before DNA linked him to a sweatshirt near the scene.", "This is the main text of the article", "media url");
        articleRepository.save(science2);

        Article science3 = new Article(author4, "NASA’s Voyager 2 Probe Enters Interstellar Space", date, category2, "For the second time in history, a human-made object has reached the space between the stars.", "This is the main text of the article", "media url");
        articleRepository.save(science3);

        Article science4 = new Article(author4, "Global carbon dioxide emissions will hit a record high in 2018", date, category2, "Global carbon dioxide emissions are expected to hit a record high in 2018, despite urgent calls from climate scientists and international groups such as the United Nations to cut back.", "This is the main text of the article", "media url");
        articleRepository.save(science4);

        Article science5 = new Article(author5, "A 5,000-year-old mass grave harbors the oldest plague bacteria ever found", date, category2, "A long-dead Scandinavian woman has yielded bacterial DNA showing that she contracted the earliest known case of the plague in humans.    ", "This is the main text of the article", "media url");
        articleRepository.save(science5);

        Article technology1 = new Article(author6, "Huawei and Samsung reveal hole-punch phones", date, category3, "Two smartphone-makers have unveiled handsets featuring a 'hole-punch' selfie camera.", "This is the main text of the article", "media url");
        articleRepository.save(technology1);

        Article technology2 = new Article(author6, "How to Stop Apps From Tracking Your Location", date, category3, "Hundreds of apps can follow your movements and share the details with advertisers, retailers and even hedge funds. Here’s how to limit the snooping.", "This is the main text of the article", "media url");
        articleRepository.save(technology2);

        Article technology3 = new Article(author6, "Breakthrough in construction of computers for mimicking human brain", date, category3, "A computer built to mimic the brain's neural networks produces similar results to that of the best brain-simulation supercomputer software currently used for neural-signaling research.", "This is the main text of the article", "media url");
        articleRepository.save(technology3);

        Article technology4 = new Article(author7, "UK Parliament Member Suggests Making Bitcoin a Payment Option for Local Taxation System", date, category3, "A conservative member (MP) of the United Kingdom’s (U.K.) Parliament has said that making payments to local authorities and utility providers with Bitcoin (BTC) should be possible. ", "This is the main text of the article", "media url");
        articleRepository.save(technology4);

        Article technology5 = new Article(author7, "Apple Hit With Sales Ban on Older iPhones in China", date, category3, "Chinese court rules that Apple infringed on two nonstandard essential patents related to photo editing and swiping on a touchscreen device.", "This is the main text of the article", "media url");
        articleRepository.save(technology5);

        Article business1 = new Article(author8, "Brexit anxiety sends pound to 18-month low", date, category4, "The pound has fallen to an 18-month low against the dollar amid mounting uncertainty about the terms of the UK's exit from the EU.", "This is the main text of the article", "media url");
        articleRepository.save(business1);

        Article business2 = new Article(author8, "Delayed Crossrail gets up to £2bn in new financing", date, category4, "It now seems unlikely train services will begin next autumn - 12 months after the project's original completion date.", "This is the main text of the article", "media url");
        articleRepository.save(business2);

        Article business3 = new Article(author8, "Interserve lenders hire Lazard amid £600m rescue bid", date, category4, "Creditors to the troubled outsourcer have hired Lazard to advise on the terms of a £600m rescue deal.", "This is the main text of the article", "media url");
        articleRepository.save(business3);

        Article business4 = new Article(author8, "UK economy slowed in October, official data shows", date, category4, "Growth slowed to 0.4 per cent in the three months to October and confirms the impression of a weakening economy ahead of Brexit next year.", "This is the main text of the article", "media url");
        articleRepository.save(business4);

        Article business5 = new Article(author6, "Amazon creates 1,000 'highly skilled' jobs in three UK cities", date, category4, "Amazon has revealed plans to create more than 1,000 jobs in the UK in Manchester, Edinburgh and Cambridge.", "This is the main text of the article", "media url");
        articleRepository.save(business5);

        Article humanInterest1 = new Article(author9, "Walkers launches recycling scheme after storm over crisp packets", date, category5, "A recycling scheme for crisp packets has been launched by Walkers after it was targeted by protests on the issue.", "This is the main text of the article", "media url");
        articleRepository.save(humanInterest1);

        Article humanInterest2 = new Article(author9, "Call to end UK's plastic export shame", date, category5, "The group says two-third's of the UK's plastic packaging waste is exported to countries 'ill-equipped' to deal with it.", "This is the main text of the article", "media url");
        articleRepository.save(humanInterest2);

        Article humanInterest3 = new Article(author9, "Dog that survived California wildfire waits a month for owner to return", date, category5, "Madison was there waiting when Andrea Gaylord was allowed back to check on her house in Paradise this week.", "This is the main text of the article", "media url");
        articleRepository.save(humanInterest3);

        Article humanInterest4 = new Article(author10, "Man Barrels 120 MPH Down Side Of Swiss Cliff In A Wingsuit", date, category5, "Spoiler alert: The man survived the jump off the famous Eiger Mountain in Switzerland.", "This is the main text of the article", "media url");
        articleRepository.save(humanInterest4);

        Article humanInterest5 = new Article(author10, "Buzzcocks singer Pete Shelley dies at 63", date, category5, "Buzzcocks lead singer Pete Shelley has died at 63 of a suspected heart attack.", "This is the main text of the article", "media url");
        articleRepository.save(humanInterest5);

    }
}