document.addEventListener('DOMContentLoaded', () => {
    const activeLink = document.querySelector('.main-nav a.is-active');

    if (activeLink) {
        activeLink.setAttribute('aria-current', 'page');
    }
});
