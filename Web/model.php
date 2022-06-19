<div class="modal fade" id="AddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
              <div class="modal-dialog modal-lg" role="document">
              <div class="modal-content">
                  <form name="userEntry">                 
              <div class="modal-header">
                <center>
                  <h4 class="modal-title" id="myModalLabel">Add New Item</h4>
                </center>
              </div>
              <div class="modal-body">            
                <div class="container-fluid">
                  <div class="row form-group">
                    <div class="col-sm-4">
                      <label class="control-label modal-label">Reference: </label>
                      <span class="text-danger">*</span> </div>
                    <div class="col-sm-8">
                      <input type="text" class="form-control" name="reference" id="reference" required>
                    </div>
                  </div>
                  </br>
                  <div class="row form-group">
                    <div class="col-sm-4">
                      <label class="control-label modal-label">Components: </label>
                      <span class="text-danger">*</span> </div>
                    <div class="col-sm-8">
                      <textarea class="form-control" name="components" id="components" required></textarea>
                    </div>
                  </div>
                  </br>
                  <div class="row form-group">
                    <div class="col-sm-4">
                      <label class="control-label modal-label">Classification: </label>
                      <span class="text-danger">*</span> </div>
                    <div class="col-sm-8">
                      <input type="text" class="form-control" name="classification" id="classification" required>
                    </div>
                  </div>
                  </br>
                  <div class="row form-group">
                    <div class="col-sm-4">
                      <label class="control-label modal-label">Consigned: </label>
                      <span class="text-danger">*</span> </div>
                    <div class="col-sm-8">
                      <input type="text" class="form-control" name="consigned" id="consigned" required>
                    </div>
                  </div>
                  </br>
              <div class="modal-footer">
              <button type="button" class="btn btn-outline-dark" data-dismiss="modal"><span class="fa fa-eject"></span> Cancel</button>
              <button type="button" class="btn btn-primary add-modal-waste" data-dismiss="modal"><span class="fa fa-save"></span> Save</a>
          </div>
                </form>
    </div>    
    </div>
      </div>    
  </div>