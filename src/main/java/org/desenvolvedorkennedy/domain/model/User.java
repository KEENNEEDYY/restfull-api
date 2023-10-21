package org.desenvolvedorkennedy.domain.model;

import java.util.List;

public class User {
    
    private Long id;
    private String name;
    
    private Account account;

    private Card card;

    private List<Feature> features;

    private List<News> news;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return this.card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return this.news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
