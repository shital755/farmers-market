using System;
using System.Data.SqlClient;
using System.Collections.Generic;
using System.Web;
using System.Web.Services;
using System.Data;

[WebService(Namespace = "http://tempuri.org/")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]

public class Service : System.Web.Services.WebService
{
    SqlConnection con = new SqlConnection("Data Source=.\\SQL2008;Initial Catalog=LBAweb;Persist Security Info=True;User ID=sa;Password=123456");



    public Service()
    {

        //Uncomment the following line if using designed components 
        //InitializeComponent(); 
    }

    [WebMethod]
    public string Reg(String Name, String Email, String Username, String Password, String confirm_password ,String gender)
    {
        String qr = "insert into reg values('" + Name + "','" + Email + "','" + Username + "','" + Password + "' ,'" + confirm_password + "','" + gender + "')";
        SqlCommand cmd = new SqlCommand(qr, con);
        con.Open();
        cmd.ExecuteNonQuery();
        con.Close();
        return "ok";
    }


    [WebMethod]
    public string Login(String Username, String Password)
    {
        String qr = "select * from reg where username = '" + Username + "' and password = '" + Password + "'";
        SqlDataAdapter adp = new SqlDataAdapter(qr, con);
        DataTable dt = new DataTable();
        adp.Fill(dt);
        if (dt.Rows.Count > 0)
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }

  


}