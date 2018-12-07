package com.codeclan.dldnews.Components;

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
    AuthorRepository authorRepository;
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

        Article politics1 = new Article(author_id, "Politics Article 1", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(politics1);

        Article politics2 = new Article(author_id, "Politics Article 2", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(politics2);

        Article politics3 = new Article(author_id, "Politics Article 3", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(politics3);

        Article politics4 = new Article(author_id, "Politics Article 4", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(politics4);

        Article politics5 = new Article(author_id, "Politics Article 5", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(politics5);

        Article science1 = new Article(author_id, "Science Article 1", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(science1);

        Article science2 = new Article(author_id, "Science Article 2", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(science2);

        Article science3 = new Article(author_id, "Science Article 3", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(science3);

        Article science4 = new Article(author_id, "Science Article 4", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(science4);

        Article science5 = new Article(author_id, "Science Article 5", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(science5);

        Article technology1 = new Article(author_id, "Technology Article 1", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(technology1);

        Article technology2 = new Article(author_id, "Technology Article 2", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(technology2);

        Article technology3 = new Article(author_id, "Technology Article 3", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(technology3);

        Article technology4 = new Article(author_id, "Technology Article 4", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(technology4);

        Article technology5 = new Article(author_id, "Technology Article 5", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(technology5);

        Article business1 = new Article(author_id, "Business Article 1", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(business1);

        Article business2 = new Article(author_id, "Business Article 2", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(business2);

        Article business3 = new Article(author_id, "Business Article 3", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(business3);

        Article business4 = new Article(author_id, "Business Article 4", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(business4);

        Article business5 = new Article(author_id, "Business Article 5", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(business5);

        Article humanInterest1 = new Article(author_id, "Business Article 1", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(humanInterest1);

        Article humanInterest2 = new Article(author_id, "Business Article 2", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(humanInterest2);

        Article humanInterest3 = new Article(author_id, "Business Article 3", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(humanInterest3);

        Article humanInterest4 = new Article(author_id, "Business Article 4", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(humanInterest4);

        Article humanInterest5 = new Article(author_id, "Business Article 5", date, category_id, "This is a summary of the article you are about to read.", "This is the main text of the article", "media url", readCounter );
        articleRepository.save(humanInterest5);

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

        Category category1 = new Author("Politics");
        authorRepository.save(category1);

        Category category2 = new Author("Science");
        authorRepository.save(category2);

        Category category3 = new Author("Technology");
        authorRepository.save(category3);

        Category category4 = new Author("Business");
        authorRepository.save(category4);

        Category category5 = new Author("Human Interest");
        authorRepository.save(category5);

    }
}