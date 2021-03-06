package project.website.objects;

public class Message {
int id;
int sender_id;
int recipient_id;
String recipient_name;
String sender_name;
String title; 
String contents;
String time_sent;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSender_id() {
	return sender_id;
}
public void setSender_id(int sender_id) {
	this.sender_id = sender_id;
}
public int getRecipient_id() {
	return recipient_id;
}
public void setRecipient_id(int recipient_id) {
	this.recipient_id = recipient_id;
}
public String getRecipient_name() {
	return recipient_name;
}
public void setRecipient_name(String recipient_name) {
	this.recipient_name = recipient_name;
}
public String getSender_name() {
	return sender_name;
}
public void setSender_name(String sender_name) {
	this.sender_name = sender_name;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContents() {
	return contents;
}
public void setContents(String contents) {
	this.contents = contents;
}
public String getTime_sent() {
	return time_sent;
}
public void setTime_sent(String time_sent) {
	this.time_sent = time_sent;
}

public String getHTML(){
String Response="";
Response +="<center><h2 style='color:white;'> Message</h2><br>";
Response+= "<table style='background-color:gray; border-radius:20px;padding:10px;border: 3px solid #224730;'>";
Response+="      <tr>";
Response+="<td style='border: 2px solid black;color:white;font-weight:bold;border-radius:10px; padding:5px;'>Sender:</td>";
Response+="<td style='color: black;'>"+this.getSender_name()+"</td>";
Response+="</tr>  " ;
Response+="<tr>";
Response+="<td style='border: 2px solid black;color:white;font-weight:bold;border-radius:10px; padding:5px;'>Date Sent: </td>";
Response+="<td style='color: black;'>"+this.getTime_sent()+"</td>";
Response+="</tr>      ";
Response+="<tr>";
Response+="<td style='border: 2px solid black;color:white;font-weight:bold;border-radius:10px; padding:5px;'>Title: </td>";
Response+="<td style='color: black;'>"+this.getTitle()+"</td>";

Response+="</tr>     ";
Response+="<tr>";
Response+="<td style='border: 2px solid black;color:white;font-weight:bold;border-radius:10px; padding:5px;'>Contents: </td>";
Response+="<td style='color: black;'><pre>"+this.getContents()+"</pre></td>";

Response+="</tr>";

Response+="</table>";



return Response;
}
}

