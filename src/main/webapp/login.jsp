<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
<meta charset="UTF-8">
<style>
.header {
	padding: 20px;
	text-align: center;
	background: #1abc9c;
	font-size: 20px
}

#reg {
	border: none;
	background-color: #FFFFFF;
}

body {
	background-image: url("assets\login.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-attachment: fixed;
}

table {
	border-collapse: separate;
	border-spacing: 0 15px;
}
</style>
</head>
<body>
	<div class="header">
		<h2>E-Learning Management System</h2>
		<h4>Login</h4>
	</div>
	<center>
		<form action="/UserControl" method="post"
			style="width: 323px; border: black; border-width: 4px solid; padding: 30px">
			<table style="padding: 5px">
				<tr>
					<td><label for="uname">User Name</label></td>
					<td><input type="text" name="uname" id="uname"
						placeholder="Enter UserName"></td>
				</tr>
				<tr>
					<td><label for="upwd">Password</label>
					<td><input type="password" id="upwd" name="upwd"
						placeholder="Enter Password" /></td>
				</tr>
				<tr>
					<td><label for="role">Select Role</td>
					<td><select name="role" id="role" style="width: 171px;">
							<option value="admin">Administrator</option>
							<option value="learner">Learner</option>
							<option value="vendor">Vendor</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><center>
							<input type="submit" name="action" value="Login" />
						</center></td>
				<tr>

					<td>Already Registered Click <a href="Registration.jsp">Here</a></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>