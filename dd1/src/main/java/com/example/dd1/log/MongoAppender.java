package com.example.dd1.log;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import com.mongodb.BasicDBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;


@Component
public class MongoAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {

    @Autowired
    private MongoTemplate mongoTemplate;

//    @Override
//    protected void append(ILoggingEvent eventObject) {
//        MongoTemplate mongoTemplate = ApplicationContextProvider.getBean(MongoTemplate.class);
//        if (mongoTemplate != null) {
//            final BasicDBObject doc = new BasicDBObject();
//            doc.append("level", eventObject.getLevel().toString());
//            doc.append("logger", eventObject.getLoggerName());
//            doc.append("thread", eventObject.getThreadName());
//            doc.append("message", eventObject.getFormattedMessage());
//            mongoTemplate.insert(doc, "log");
//        }
//    }

    @Override
    protected void append(ILoggingEvent eventObject) {
        final BasicDBObject doc = new BasicDBObject();
        doc.append("level", eventObject.getLevel().toString());
        doc.append("logger", eventObject.getLoggerName());
        doc.append("thread", eventObject.getThreadName());
        doc.append("message", eventObject.getFormattedMessage());
        mongoTemplate.insert(doc, "log");
    }

}
