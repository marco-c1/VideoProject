package com.example.VideoProject;

import android.os.Parcel;
import android.os.Parcelable;

public class Celebrity implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Celebrity createFromParcel(Parcel in) {
            return new Celebrity(in);
        }

        public Celebrity[] newArray(int size) {
            return new Celebrity[size];
        }
    };
    //  Image of the celebrity
    private int mImage;
    //  Name of the celebrity
    private String mName;
    //  Rating of the celebrity
    private int mRatingPhoto;
    //  Rating number of the celebrity
    private String mRatingNumber;
    //  Occupation of the celebrity
    private String mOccupation;
    // Awards of the celebrity
    private String mAwards;
    //  Masterwork of the celebrity
    private String mMasterWork;
    //  Chat price of the celebrity
    private String mChatPrice;
    //  Video price of the celebrity
    private String mVideoPrice;

    /**
     * Create a new Celebrity object.
     */
    public Celebrity(int image, String name, int ratingPhoto, String ratingNumber, String occupation, String awards, String masterwork, String chatPrice, String videoPrice) {
        mImage = image;
        mName = name;
        mRatingPhoto = ratingPhoto;
        mRatingNumber = ratingNumber;
        mOccupation = occupation;
        mAwards = awards;
        mMasterWork = masterwork;
        mChatPrice = chatPrice;
        mVideoPrice = videoPrice;
    }

    public Celebrity(Parcel in) {
        mImage = in.readInt();
        mName = in.readString();
        mRatingPhoto = in.readInt();
        mRatingNumber = in.readString();
        mOccupation = in.readString();
        mAwards = in.readString();
        mMasterWork = in.readString();
        mChatPrice = in.readString();
        mVideoPrice = in.readString();
    }

    /**
     * Get the image of the celebrity
     */
    public int getImage() {
        return mImage;
    }

    /**
     * Get the name of the celebrity
     */
    public String getName() {
        return mName;
    }

    /**
     *  Get the rating photo of the celebrity
     */
    public int getRatingPhoto(){
        return mRatingPhoto;
    }

    /**
     *  Get the rating number of the celebrity
     */
    public String getRating(){
        return mRatingNumber;
    }

    /**
     * Get the occupation of the celebrity
     */
    public String getOccupation() {
        return mOccupation;
    }

    /**
     *  Get the achievements of the celebrity
     */
    public String getAwards(){
        return mAwards;
    }

    /**
     * Get the masterwork of the celebrity
     */
    public String getMasterwork() {
        return mMasterWork;
    }

    /**
     * Get the chat price of the celebrity
     */
    public String getChatPrice() {
        return mChatPrice;
    }

    /**
     * Get the video price of the celebrity
     */
    public String getVideoPrice() {
        return mVideoPrice;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mImage);
        parcel.writeString(mName);
        parcel.writeInt(mRatingPhoto);
        parcel.writeString(mRatingNumber);
        parcel.writeString(mOccupation);
        parcel.writeString(mAwards);
        parcel.writeString(mMasterWork);
        parcel.writeString(mChatPrice);
        parcel.writeString(mVideoPrice);
    }
}