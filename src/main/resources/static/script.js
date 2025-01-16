document.getElementById('searchButton').addEventListener('click', () => {
    const query = document.getElementById('searchInput').value;
    if (!query.trim()) {
        alert("Please enter a search query.");
        return;
    }

    fetch(`http://localhost:8080/artworks?query=${query}`)
        .then(response => {
            if (!response.ok) {
                throw new Error("Failed to fetch artworks.");
            }
            return response.json();
        })
        .then(data => {
            const container = document.getElementById('artworksContainer');
            container.innerHTML = ''; 

            if (data.length === 0) {
                container.innerHTML = '<p>No artworks found.</p>';
                return;
            }

            data.forEach(artwork => {
                const artworkDiv = document.createElement('div');
                artworkDiv.className = 'artwork';
                artworkDiv.innerHTML = `
                    <h3>${artwork.title}</h3>
                    <p><strong>Artist:</strong> ${artwork.artist || 'Unknown'}</p>
                    <p><strong>Date:</strong> ${artwork.date || 'Unknown'}</p>
                `;
                container.appendChild(artworkDiv);
            });
        })
        .catch(error => {
            console.error("Error:", error);
            alert("Failed to load artworks. Please try again.");
        });
});
