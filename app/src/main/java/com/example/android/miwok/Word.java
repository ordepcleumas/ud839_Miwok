package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /**
     * Image resource id of the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //A minha tentativa
    //private int mImagemState;

    /**
     * Audio resource id of the word
     */
    private int mAudioResourceId;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId   is the resource ID for the audio file associated with this word
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        //this.mImagemState = View.GONE;
        this.mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the resource id of the image
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;

        //this.mImagemState = View.VISIBLE;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }


    /**
     * Get the Miwok translation of the word.
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the id of the image file
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    //public int getmImagemState() {
    //    return mImagemState;
    //}

    /**
     * Get the id of the audio file
     */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
