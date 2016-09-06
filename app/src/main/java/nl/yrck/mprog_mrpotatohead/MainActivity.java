package nl.yrck.mprog_mrpotatohead;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView arms, ears, eyebrows, eyes, glasses, hat, mouth, mustache, nose, shoes;
    private CheckBox checkboxArms, checkBoxEars, checkboxEyebrows, checkboxEyes, checkBoxGlasses, checkBoxHat, checkBoxMouth, checkBoxMustache, checkBoxNose, checkBoxShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = (ImageView) findViewById(R.id.potato_arms);
        ears = (ImageView) findViewById(R.id.potato_ears);
        eyebrows = (ImageView) findViewById(R.id.potato_eyebrows);
        eyes = (ImageView) findViewById(R.id.potato_eyes);
        glasses = (ImageView) findViewById(R.id.potato_glasses);
        hat = (ImageView) findViewById(R.id.potato_hat);
        mouth = (ImageView) findViewById(R.id.potato_mouth);
        mustache = (ImageView) findViewById(R.id.potato_mustache);
        nose = (ImageView) findViewById(R.id.potato_nose);
        shoes = (ImageView) findViewById(R.id.potato_shoes);

        checkboxArms = (CheckBox) findViewById(R.id.checkbox_arms);
        checkboxArms.setOnClickListener(this);
        checkBoxEars = (CheckBox) findViewById(R.id.checkbox_ears);
        checkBoxEars.setOnClickListener(this);
        checkboxEyebrows = (CheckBox) findViewById(R.id.checkbox_eyebrows);
        checkboxEyebrows.setOnClickListener(this);
        checkboxEyes = (CheckBox) findViewById(R.id.checkbox_eyes);
        checkboxEyes.setOnClickListener(this);
        checkBoxGlasses = (CheckBox) findViewById(R.id.checkbox_glasses);
        checkBoxGlasses.setOnClickListener(this);
        checkBoxHat = (CheckBox) findViewById(R.id.checkbox_hat);
        checkBoxHat.setOnClickListener(this);
        checkBoxMouth = (CheckBox) findViewById(R.id.checkbox_mouth);
        checkBoxMouth.setOnClickListener(this);
        checkBoxMustache = (CheckBox) findViewById(R.id.checkbox_mustache);
        checkBoxMustache.setOnClickListener(this);
        checkBoxNose = (CheckBox) findViewById(R.id.checkbox_nose);
        checkBoxNose.setOnClickListener(this);
        checkBoxShoes = (CheckBox) findViewById(R.id.checkbox_shoes);
        checkBoxShoes.setOnClickListener(this);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        recheckBoxes();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        recheckBoxes();
    }

    @Override
    public void onClick(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkbox_arms:
                if (checked) {
                    arms.setTranslationY(-100f);
                    arms.animate().translationY(0);
                    arms.setVisibility(ImageView.VISIBLE);
                } else {
                    arms.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.checkbox_ears:
                if (checked) {
                    ears.setTranslationY(-100f);
                    ears.animate().translationY(0);
                    ears.setVisibility(ImageView.VISIBLE);
                } else {
                    ears.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.checkbox_eyebrows:
                if (checked) {
                    eyebrows.setTranslationX(150f);
                    eyebrows.animate().translationX(0);
                    eyebrows.setVisibility(ImageView.VISIBLE);
                } else {
                    eyebrows.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.checkbox_eyes:
                if (checked) {
                    eyes.setAlpha(0f);
                    eyes.animate().alpha(1f).setDuration(2000);
                    eyes.setVisibility(ImageView.VISIBLE);
                } else {
                    eyes.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.checkbox_glasses:
                if (checked) {
                    glasses.setTranslationY(-100f);
                    glasses.animate().translationY(0);
                    glasses.setVisibility(ImageView.VISIBLE);
                } else {
                    glasses.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.checkbox_hat:
                if (checked) {
                    hat.setTranslationX(-150f);
                    hat.animate().translationX(0);
                    hat.setVisibility(ImageView.VISIBLE);
                } else {
                    hat.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.checkbox_mouth:
                if (checked) {
                    mouth.setTranslationY(-100f);
                    mouth.animate().translationY(0);
                    mouth.setVisibility(ImageView.VISIBLE);
                } else {
                    mouth.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.checkbox_mustache:
                if (checked) {
                    mustache.setTranslationY(100f);
                    mustache.animate().translationY(0);
                    mustache.setVisibility(ImageView.VISIBLE);
                } else {
                    mustache.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.checkbox_nose:
                if (checked) {
                    nose.setTranslationY(100f);
                    nose.animate().translationY(0);
                    nose.setVisibility(ImageView.VISIBLE);
                } else {
                    nose.setVisibility(ImageView.INVISIBLE);
                }
                break;
            case R.id.checkbox_shoes:
                if (checked) {
                    shoes.setTranslationY(100f);
                    shoes.animate().translationY(0);
                    shoes.setVisibility(ImageView.VISIBLE);
                } else {
                    shoes.setVisibility(ImageView.INVISIBLE);
                }
                break;
        }
    }

    public void recheckBoxes() {
        if (checkboxArms.isChecked()) arms.setVisibility(ImageView.VISIBLE);
        if (checkBoxEars.isChecked()) ears.setVisibility(ImageView.VISIBLE);
        if (checkboxEyebrows.isChecked()) eyebrows.setVisibility(ImageView.VISIBLE);
        if (checkboxEyes.isChecked()) eyes.setVisibility(ImageView.VISIBLE);
        if (checkBoxGlasses.isChecked()) glasses.setVisibility(ImageView.VISIBLE);
        if (checkBoxHat.isChecked()) hat.setVisibility(ImageView.VISIBLE);
        if (checkBoxMouth.isChecked()) mouth.setVisibility(ImageView.VISIBLE);
        if (checkBoxMustache.isChecked()) mustache.setVisibility(ImageView.VISIBLE);
        if (checkBoxNose.isChecked()) nose.setVisibility(ImageView.VISIBLE);
        if (checkBoxShoes.isChecked()) shoes.setVisibility(ImageView.VISIBLE);
    }
}
