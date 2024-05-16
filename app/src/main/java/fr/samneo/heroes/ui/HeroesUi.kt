package fr.samneo.heroes.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import fr.samneo.heroes.R
import fr.samneo.heroes.data.DataSource
import fr.samneo.heroes.model.Hero

@Composable
fun HeroesUi(modifier: Modifier = Modifier) {
    LazyColumn(modifier) {
        items(DataSource.Heroes) { hero ->
            HeroCard(
                hero = hero,
                Modifier
                    .fillMaxWidth()
                    .padding(
                        start = dimensionResource(id = R.dimen.marge_outside_hero_card),
                        end = dimensionResource(id = R.dimen.marge_outside_hero_card),
                        bottom = dimensionResource(id = R.dimen.marge_outside_hero_card)
                    ),
            )
        }
    }
}

@Composable
fun HeroCard(hero: Hero, modifier: Modifier = Modifier) {
    Card(modifier) {
        Row {
            NameAndDescritpionHero(
                name = stringResource(id = hero.nameRes),
                description = stringResource(id = hero.descriptionRes),
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.marge_inside_hero_card))
                    .weight(1f)
            )
            Image(
                painter = painterResource(id = hero.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.marge_inside_hero_card))
                    .clip(MaterialTheme.shapes.small)
                    .size(dimensionResource(id = R.dimen.image_size)),
            )
        }
    }
}

@Composable
fun NameAndDescritpionHero(name: String, description: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(text = name, style = MaterialTheme.typography.titleMedium)
        Text(text = description, style = MaterialTheme.typography.bodyMedium)
    }
}

@Preview
@Composable
fun HeroesUiPreview() {
    HeroesUi()
}

@Preview
@Composable
fun HeroCardPreview() {
    val hero = DataSource.Heroes[3]
    HeroCard(hero = hero)
}