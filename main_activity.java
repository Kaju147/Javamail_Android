  public void onClick(View view) {

        String from=et_mail_from.getText().toString();
        final String s_email=et_mail_to.getText().toString();
        final String Subject=et_mail_subject.getText().toString();
        final String Body=et_mail_message.getText().toString();


        new Thread(new Runnable()
        {
            public void run() {
                try {

                    String user="userid of gmail";
                    String password="password";

                    GmailSender gmailSender=new GmailSender(user,password);
                    gmailSender.sendMail(Subject, Body,
                            user,
                            s_email);

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                }
            }

        }).start();
