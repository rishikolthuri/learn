<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type='text/css'>
body {
	background-image: url("assets\login.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-attachment: fixed;
}

.header {
	padding: 20px;
	text-align: center;
	background: #1abc9c;
	font-size: 20px;
	width: 100%
}

#f1 {
	width: 60%;
}

#f2 {
	width: 40%;
}

table {
	border-collapse: separate;
	border-spacing: 0 15px;
}

input::-webkit-outer-spin-button, input::-webkit-inner-spin-button {
	-webkit-appearance: none;
	margin: 0;
}
</style>
</head>
<body>
	<div class="header">
		<h2>E-Learning Management System</h2>
		<h4>Login</h4>
	</div>
	<center>
		<div class="column" style="height: 100%">
			<fieldset id="fieldset-auto-width">
				<legend>Personal Information</legend>
				<table>
					<form action="UserControl">
						<tr>
							<td><label for="uname">User Name</label></td>
							<td><input type="text" id="uname" placeholder="Full Name"
								name="uname" required /></td>
						</tr>
						<tr>
							<td><label for="uage">Age</label></td>
							<td><input type="number" id="uage" placeholder="Age"
								name="uage" required /></td>
						</tr>
						<tr>
							<td><label for="ucont">Contact Number</label></td>
							<td><input type="tel" id="ucont"
								placeholder="Contact Number" name="ucont"
								pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required /></td>
						</tr>
						<tr>
							<td><label for="ugen">Gender</label></td>
							<td><input type="radio" placeholder="Enter Gender" id="ugen"
								name="ugen" value="Male" size="10" required />Male
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio"
								placeholder="Enter Gender" id="ugen" name="ugen" value="Female"
								size="10" required />Female</td>
						</tr>
					</form>
				</table>
			</fieldset>
			<fieldset id="fieldset-auto-width">
				<legend>Address Information</legend>
				<table>
					<form action="UserControl">
						<tr>
							<td><input type="text" id="address1"
								placeholder="Address line1" name="address1" required /></td>
							<td><input type="text" id="address2"
								placeholder="Address line2" name="address2" /></td>
						</tr>
						<tr>
							<td><input type="text" id="city" name="city"
								placeholder="City" required /></td>
							<td><input type="text" id="state" name="state"
								placeholder="State" required /></td>
						</tr>
						<tr>
							<td><input type="text" id="country" name="country"
								placeholder="Country" required /></td>
							<td><input type="number" id="pincode" name="pincode"
								placeholder="Pincode" maxlength="6" required /></td>
						</tr>
					</form>
				</table>
			</fieldset>
		</div>
		<div>
			<fieldset>
				<legend>Professional Information</legend>
				<table>
					<form action="UserControl">
						<tr>
							<td><label for="email">Email Id</label></td>
							<td><input type="email" id="email" name="email"
								placeholder="Email Id" required /></td>
						</tr>
						<tr>
							<td><label for="upwd">Password</label></td>
							<td><input type="password" id="upwd" name="upwd"
								placeholder="Password" required /></td>
						</tr>
						<tr>
							<td><label for="utype">Select Role</label></td>
							<td><input type="radio" id="utype" name="utype"
								value="Learner" required />Learner
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio"
								id="utype" name="utype" value="Vendor" required />Vendor</td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" class="registerbtn" name="s"
								value="Register"></td>
							<td><input type="hidden" name="action" value="Register" /></td>
						</tr>
						<tr>
							<center>
								<td>Already Registered Click <a href="login.jsp">Here</a></td>
							</center>
						</tr>
					</form>

				</table>
			</fieldset>
		</div>
	</center>

</body>
</html>