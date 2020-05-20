<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Map</title>

</head>

<body>
	<div id="myModal" class="modal fade" role="dialog">
      <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">
              &times;
            </button>
            <h4 class="modal-title">Điền thông tin cây</h4>
          </div>
          <div class="modal-body">
            <form>
              <div class="form-group">
                <label for="Latitude">Latitude:</label>
                <input
                  disabled
                  type="text"
                  class="form-control"
                  id="Latitude"
                />
              </div>
              <div class="form-group">
                <label for="Longitude">Longitude:</label>
                <input
                  disabled
                  type="text"
                  class="form-control"
                  id="Longitude"
                />
              </div>
              <div class="form-group">
                <label for="nameTree">Tên cây:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="Nhập tên cây"
                  id="nameTree"
                />
              </div>
              <div class="form-group">
                <label for="height">Chiều cao:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="Nhập Chiều cao"
                  id="height"
                />
              </div>
              <div class="form-group">
                <label for="specieTree">Giống cây:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="Nhập Giống cây"
                  id="specieTree"
                />
              </div>
              <div class="form-group">
                <label for="ageTree">Tuổi cây:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="Nhập Tuổi cây"
                  id="ageTree"
                />
              </div>
              <button type="submit" class="btn btn-success">Submit</button>
            </form>
          </div>
        </div>
      </div>
    </div>
    <button type="button" class="btn btn-success" onclick="addMarker()">Add</button>

    <!--Map-->
    <div id="map"></div>

    <script>
      var map;
      function initMap() {
        var myLatlng = new google.maps.LatLng(16.047079, 108.20623);
        map = new google.maps.Map(document.getElementById("map"), {
          center: myLatlng,
          zoom: 12,
        });

        var marker = new google.maps.Marker({
          position: myLatlng,
          map: map,
          title: "maker DN",
        });
        marker.addListener("click", function (mapsMouseEvent) {
          $("#myModal").modal();
          $("#Latitude").val(mapsMouseEvent.latLng.lat().toString());
          $("#Longitude").val(mapsMouseEvent.latLng.lng().toString());
        });
        marker.setMap(map);
      }
    </script>
    <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCB2GCaVRZE7pXySJWFdDkudO607EL38WU&callback=initMap"
      async
      defer
    ></script>
</body>

</html>
