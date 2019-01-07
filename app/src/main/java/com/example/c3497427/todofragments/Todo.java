package com.example.c3497427.todofragments;

import java.util.Date;
import java.util.UUID;

//TodoListActivity Model

public class Todo
{

    private UUID mId;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;

    public Todo()
    {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public boolean isComplete()
    {
        return mIsComplete;
    }

    public void setComplete(boolean complete)
    {
        mIsComplete = complete;
    }

    public UUID getId()
    {
        return mId;
    }

    public void setId(UUID todoId)
    {
        mId = todoId;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public void setTitle(String title)
    {
        mTitle = title;
    }

    public String getDetail()
    {
        return mDetail;
    }

    public void setDetail(String detail)
    {
        mDetail = detail;
    }

    public Date getDate()
    {
        return mDate;
    }

    public void setDate(Date date)
    {
        mDate = date;
    }
}
