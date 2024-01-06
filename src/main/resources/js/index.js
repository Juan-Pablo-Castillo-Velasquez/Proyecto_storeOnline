document.addEventListener('DOMContentLoaded', function () {
      const menuButton = document.getElementById('menuButton');
      const mobileMenu = document.getElementById('navbarSupportedContentY');

      menuButton.addEventListener('click', function () {
         
          mobileMenu.classList.toggle('hidden');
      });

     
      const mobileLinks = document.querySelectorAll('#navbarSupportedContentY a');

      mobileLinks.forEach(function (link) {
          link.addEventListener('click', function () {
              mobileMenu.classList.add('hidden');
          });
      });
  });