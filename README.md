# Android-TextView-Button-EditText
Set Text View value from Edit Text with a button.


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText et = (EditText)findViewById(R.id.editText1);
		final TextView tv = (TextView)findViewById(R.id.textView1);
		Button b = (Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tv.setText(et.getText());
				tv.setText(pg.getTextName(et.getText().toString()));
				
				Pugo pg = new Pugo();
				
				pg.setText(et.getText().toString());
				tv.setText(pg.getText());
				
			}
		});
	}

//

	private class Pugo {
		String text;

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

	}

