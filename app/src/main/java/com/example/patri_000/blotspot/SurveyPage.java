package com.example.patri_000.blotspot;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.Toast;






public class SurveyPage extends AppCompatActivity {
    private static RadioGroup RadioGroup;
    private static RadioButton radio_b;
    // private static RadioGroup RadioGroup_1;
    //private static RadioButton radio_c;
    // private static RadioGroup RadioGroup_2;
    // private static RadioButton radio_d;
    // private static RadioGroup RadioGroup_3;
    // private static RadioButton radio_e;
    //  private static RadioGroup RadioGroup_4;
    private static Button button_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_page);
        onClicklistenerButton();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.response_1:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.response_2:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    //This is the action for the submit button.
    public void onClicklistenerButton() {
        RadioGroup = (RadioGroup)findViewById(R.id.RadioGroup);
        //RadioGroup_1 = (RadioGroup)findViewById(R.id.RadioGroup_1);
        //RadioGroup_2 = (RadioGroup)findViewById(R.id.RadioGroup_2);
        //RadioGroup_3 = (RadioGroup)findViewById(R.id.RadioGroup_3);
        //RadioGroup_4 = (RadioGroup)findViewById(R.id.RadioGroup_4);
        button_sub = (Button)findViewById(R.id.button_sub);

        button_sub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selected_id = RadioGroup.getCheckedRadioButtonId();
                        radio_b = (RadioButton)findViewById(selected_id);
                        Toast.makeText(SurveyPage.this,
                                radio_b.getText().toString(), Toast.LENGTH_SHORT). show();
                    }
                }
        );

    }


}