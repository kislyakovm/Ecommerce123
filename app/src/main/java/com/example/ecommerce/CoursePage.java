package com.example.ecommerce;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CoursePage extends AppCompatActivity {
    ConstraintLayout coursePageBg;
    ImageView coursePageImage;
    TextView coursePageTitle, coursePageDate, coursePageLevel, coursePageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        coursePageBg = findViewById(R.id.coursePageBg);
        coursePageImage = findViewById(R.id.coursePageImage);
        coursePageTitle = findViewById(R.id.coursePageTitle);
        coursePageDate = findViewById(R.id.coursePageDate);
        coursePageLevel = findViewById(R.id.coursePageLevel);
        coursePageText = findViewById(R.id.coursePageText);

        coursePageBg.setBackgroundColor(getIntent().getIntExtra("courseBg", 0));
        coursePageImage.setImageResource(getIntent().getIntExtra("courseImage", 0));
        coursePageTitle.setText(getIntent().getStringExtra("courseTitle"));
        coursePageDate.setText(getIntent().getStringExtra("courseDate"));
        coursePageLevel.setText(getIntent().getStringExtra("courseLevel"));
        coursePageText.setText(getIntent().getStringExtra("courseText"));
    }
}