package com.example.snugalpha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.snugalpha.Utils.Task;
import com.example.snugalpha.Adapter.TaskAdapter;

import java.util.ArrayList;
import java.util.List;

public class TaskListActivity extends AppCompatActivity {

    private ListView listView;
    private List<Task> tasks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        init();

    }

    public void  init(){

        listView = findViewById(R.id.list_view);
        for (int i = 0;i<5;i++){
            Task task = new Task("这是个标题"+(i+1)+"","这是有点详细又不是很详细的任务详情"+(i+1)+"");
            tasks.add(task);
        }
        TaskAdapter taskAdapter = new TaskAdapter(TaskListActivity.this,R.layout.task_item,tasks);
        listView.setAdapter(taskAdapter);
    }

}
