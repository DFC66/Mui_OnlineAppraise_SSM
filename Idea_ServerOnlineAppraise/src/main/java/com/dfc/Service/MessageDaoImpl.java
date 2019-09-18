package com.dfc.Service;

import com.dfc.pojo.Message;

import com.dfc.mappers.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MessageDaoImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;



    @Override
    public Message getMessage(Integer id) {

        return messageDao.getMessage(id);
    }

    @Override
    public List<Message> getWholeMessage() {
        return  messageDao.getWholeMessage();
    }

    @Override
    public List<Message> getHighMessage() {
        return  messageDao.getHighMessage();
    }

    @Override
    public List<Message> getSearchMessage(String key) {
        return messageDao.getSearchMessage(key);
    }

    @Override
    public List<Message> getSearchHighMessage(String key) {
        return messageDao.getSearchHighMessage(key);
    }

    @Override
    public void UpdateWholeAppraise() {
        messageDao.UpdateWholeAppraise();
    }

    @Override
    public void InsertMessage(Message message) {
        messageDao.InsertMessage(message);
    }


}
