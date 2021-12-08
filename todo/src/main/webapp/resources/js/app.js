App = {

  init: async function() {
    // Load pets.
    fetch('./petSelect')
    .then(response => response.json())
    .then(this.makeList)
    .then(()=>{
		this.bindEvents();
		this.markAdopted();
     })
  },

  makeList : function(data) {
      var petsRow = $('#petsRow');
      var petTemplate = $('#petTemplate');

      for (i = 0; i < data.length; i ++) {
        petTemplate.find('.panel-title').text(data[i].name);
        petTemplate.find('img').attr('src',  data[i].picture);
        petTemplate.find('.pet-breed').text(data[i].breed);
        petTemplate.find('.pet-age').text(data[i].age);
        petTemplate.find('.pet-location').text(data[i].location);
        petTemplate.find('.btn-adopt').data('id', data[i].id);

        petsRow.append(petTemplate.html());
      }
    },

  bindEvents: function() {
    $(document).on('click', '.btn-adopt', App.handleAdopt);
  },

  markAdopted: function(adopters, account) {
	fetch('./adoptSelect')
    .then(response => response.json())
    .then(data=>{
		for (i = 0; i < data.length; i++) {
			$('.panel-pet').eq(data[i].id).find('button').text('Success').attr('disabled', true);
		}
	})
  },

  handleAdopt: function(event) {
    event.preventDefault();

    var petId = parseInt($(event.target).data('id'));
    var amount = prompt("보내실 금액을입력해주세요");
  }
};

$(function() {
    App.init();
});
