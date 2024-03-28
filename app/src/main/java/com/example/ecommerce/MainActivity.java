package com.example.ecommerce;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.adapter.CategoryAdapter;
import com.example.ecommerce.adapter.CourseAdapter;
import com.example.ecommerce.model.Category;
import com.example.ecommerce.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView categoryRecycle, courseRecycle;
    CourseAdapter courseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Игры"));
        categoryList.add(new Category(2, "Сайты"));
        categoryList.add(new Category(3, "Языки"));
        categoryList.add(new Category(4, "Прочее"));

        setCategoryRecycle(categoryList);

        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "java_2", "Профессия Java\nразработчик", "1 января", "#424345", "начальный", "test text"));
        courseList.add(new Course(2, "python_3_1_", "Профессия Python\nразработчик", "10 января", "#9FA52D", "средний", "test text"));
        courseList.add(new Course(3, "unity", "Профессия Unity\nразработчик", "5 января", "#65173D", "начальный", "test text"));
        courseList.add(new Course(4, "frontend", "Профессия Backend\nразработчик", "7 января", "#B04935", "средний", "test text"));
        courseList.add(new Course(5, "backend", "Профессия Frontend\nразработчик", "4 января", "#2D55A5", "начальный", "test text"));
        courseList.add(new Course(6, "fullstack", "Профессия Fullstack\nразработчик", "9 января", "#FFC007", "средний", "test text"));

        setCourseRecycle(courseList);

    }

    private void setCategoryRecycle(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        categoryRecycle = findViewById(R.id.categoryRecycle);
        categoryRecycle.setLayoutManager(layoutManager);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycle.setAdapter(categoryAdapter);
    }

    private void setCourseRecycle(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        courseRecycle = findViewById(R.id.courseRecycle);
        courseRecycle.setLayoutManager(layoutManager);
        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycle.setAdapter(courseAdapter);
    }

}