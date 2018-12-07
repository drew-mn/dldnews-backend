package com.codeclan.dldnews.projections;

import com.codeclan.dldnews.models.Article;
import com.codeclan.dldnews.models.Author;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForAuthor", types = Author.class)
public interface EmbedForAuthor {
    String getName();
    List<Article> getArticles();
}
