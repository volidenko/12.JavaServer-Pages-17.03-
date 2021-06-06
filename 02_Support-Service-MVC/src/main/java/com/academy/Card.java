package com.academy;

public class Card {
    private String clientName;
    private String topic;
    private String message;
    public String getClientName()
    {
        return clientName;
    }
    void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
    public String getTopic()
    {
        return topic;
    }
    void setTopic(String topic)
    {
        this.topic = topic;
    }
    public String getMessage()
    {
        return message;
    }
    void setMessage(String message)
    {
        this.message = message;
    }
}